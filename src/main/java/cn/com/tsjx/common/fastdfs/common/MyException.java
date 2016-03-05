/*
 * Copyright (C) 2008 Happy Fish / YuQing
 *
 * FastDFS Java Client may be copied only under the terms of the GNU Lesser
 * General Public License (LGPL).
 * Please visit the FastDFS Home Page http://www.csource.org/ for more detail.
 */

package cn.com.tsjx.common.fastdfs.common;

/**
 * My Exception
 * 
 * @author Happy Fish / YuQing
 * @version Version 1.0
 */
public class MyException extends Exception {
    private static final long serialVersionUID = -1035525099473017987L;

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}