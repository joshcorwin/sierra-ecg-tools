// <copyright file="TarEntry.cs">
//  Copyright (c) 2011 Christopher A. Watford
//
//  Permission is hereby granted, free of charge, to any person obtaining a copy of
//  this software and associated documentation files (the "Software"), to deal in
//  the Software without restriction, including without limitation the rights to
//  use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
//  of the Software, and to permit persons to whom the Software is furnished to do
//  so, subject to the following conditions:
//
//  The above copyright notice and this permission notice shall be included in all
//  copies or substantial portions of the Software.
//
//  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
//  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
//  SOFTWARE.
// </copyright>
// <author>Christopher A. Watford [christopher.watford@gmail.com]</author>
using System;
using System.Linq;
using System.Text;

namespace SierraEcg.IO
{
    public class TarEntry
    {
        private static char[] trim = new[] { ' ', '\0' };
        private static DateTime epoch = new DateTime(1970, 1, 1, 0, 0, 0, DateTimeKind.Utc);

        //100	 name	 name of file
        public string Name
        {
            get;
            private set;
        }

        //8	 mode	 file mode
        public int Mode
        {
            get;
            private set;
        }

        //8	 uid	 owner user ID	
        public int UserId
        {
            get;
            private set;
        }

        //8	 gid	 owner group ID
        public int GroupId
        {
            get;
            private set;
        }

        //12	 size	 length of file in bytes
        public int Size
        {
            get;
            private set;
        }

        //12	 mtime	 modify time of file
        public DateTime LastModified
        {
            get;
            private set;
        }

        //8	 chksum	 checksum for header
        private int checksum;

        //1	 link	 indicator for links
        public char Type
        {
            get;
            private set;
        }

        //100	 linkname	 name of linked file
        public string LinkedName
        {
            get;
            private set;
        }

        //6	 magic	 USTAR indicator
        private string magic;

        //2	 version	 USTAR version
        private string version;

        //32	 uname	 owner user name
        public string UserName
        {
            get;
            private set;
        }

        //32	 gname	 owner group name
        public string GroupName
        {
            get;
            private set;
        }

        //8	 devmajor	 device major number
        public string DeviceVersionMajor
        {
            get;
            private set;
        }

        //8	 devminor	 device minor number
        public string DeviceVersionMinor
        {
            get;
            private set;
        }

        //155	 prefix	 prefix for file name
        public string Prefix
        {
            get;
            private set;
        }

        private TarEntry()
        {
        }

        static string GetString(byte[] block, int start, int count)
        {
            var debug = Encoding.ASCII.GetString(block, start, count).TrimEnd(trim);
            return debug;
        }

        static int GetInt32(byte[] block, int start, int count, int @base = 8)
        {
            var debug = GetString(block, start, count);
            return Convert.ToInt32(debug, @base);
        }

        static long GetLong(byte[] block, int start, int count)
        {
            var debug = GetString(block, start, count);
            return Convert.ToInt64(debug);
        }

        internal static TarEntry FromBlock(byte[] block)
        {
            var entry = new TarEntry();
            entry.Name = GetString(block, 0, 100);
            entry.Mode = GetInt32(block, 100, 8, @base: 8);
            entry.UserId = GetInt32(block, 108, 8);
            entry.GroupId = GetInt32(block, 116, 8);
            entry.Size = GetInt32(block, 124, 12);
            int mtime = GetInt32(block, 136, 12);
            entry.LastModified = epoch.AddSeconds(mtime);
            int checksum = GetInt32(block, 148, 8);
            entry.Type = GetString(block, 156, 1)[0];
            entry.LinkedName = GetString(block, 157, 100);
            entry.magic = GetString(block, 257, 6);
            if (entry.magic == "ustar")
            {
                entry.version = GetString(block, 263, 2);
                entry.UserName = GetString(block, 265, 32);
                entry.GroupName = GetString(block, 297, 32);
                entry.DeviceVersionMajor = GetString(block, 329, 8);
                entry.DeviceVersionMinor = GetString(block, 337, 8);
                entry.Prefix = GetString(block, 345, 155);
                //	long atime = GetLong (block, 476, 12);
                //	long ctime = GetLong (block, 488, 12);
            }
            return entry;
        }
    }
}
