/*
 * Copyright (c) 1999, 2001, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.omg.CORBA;

import org.checkerframework.checker.signedness.qual.PolySigned;

/**
* The Helper for <tt>OctetSeq</tt>.  For more information on
* Helper files, see <a href="doc-files/generatedfiles.html#helper">
* "Generated Files: Helper Files"</a>.<P>
* org/omg/CORBA/OctetSeqHelper.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from streams.idl
* 13 May 1999 22:41:36 o'clock GMT+00:00
*
* The class definition has been modified to conform to the following
* OMG specifications :
*   <ul>
*       <li> ORB core as defined by CORBA 2.3.1
*       (<a href="http://cgi.omg.org/cgi-bin/doc?formal/99-10-07">formal/99-10-07</a>)
*       </li>
*
*       <li> IDL/Java Language Mapping as defined in
*       <a href="http://cgi.omg.org/cgi-bin/doc?ptc/00-01-08">ptc/00-01-08</a>
*       </li>
*   </ul>
*/

public abstract class OctetSeqHelper
{
    private static String  _id = "IDL:omg.org/CORBA/OctetSeq:1.0";

    public static void insert (org.omg.CORBA.Any a, byte[] that)
    {
        org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
        a.type (type ());
        write (out, that);
        a.read_value (out.create_input_stream (), type ());
    }

    public static byte[] extract (org.omg.CORBA.Any a)
    {
        return read (a.create_input_stream ());
    }

    private static org.omg.CORBA.TypeCode __typeCode = null;
    synchronized public static org.omg.CORBA.TypeCode type ()
    {
        if (__typeCode == null)
            {
                __typeCode = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_octet);
                __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
                __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (org.omg.CORBA.OctetSeqHelper.id (), "OctetSeq", __typeCode);
            }
        return __typeCode;
    }

    public static String id ()
    {
        return _id;
    }

    public static byte[] read (org.omg.CORBA.portable.InputStream istream)
    {
        byte value[] = null;
        int _len0 = istream.read_long ();
        value = new byte[_len0];
        istream.read_octet_array (value, 0, _len0);
        return value;
    }

    public static void write (org.omg.CORBA.portable.OutputStream ostream, @PolySigned byte[] value)
    {
        ostream.write_long (value.length);
        ostream.write_octet_array (value, 0, value.length);
    }

}
