/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 Artur Charukhchyan
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.citybyweather.java.exceptions;

import java.io.FileNotFoundException;
import java.util.List;


public class FilesNotFoundCurrentDirException extends FileNotFoundException {

    public static final long serialVersionUID = 42L;
    public List<String> fileNames;

    public FilesNotFoundCurrentDirException(List<String> fileNames) {

        super("Files Not Found");
        this.fileNames = fileNames;
    }


    @Override
    public String getMessage() {

        String errorMessage = "";


        for (String fileName : this.fileNames)
            errorMessage += "- " + fileName + "\n";

        return errorMessage;
    }


}
