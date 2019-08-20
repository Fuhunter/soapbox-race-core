package com.soapboxrace.core.api.util;

import com.google.common.io.Resources;

import java.io.IOException;
import java.nio.charset.Charset;

public class ResourceUtils {
    /**
     * Reads given resource file as a string.
     *
     * @param fileName the path to the resource file
     * @return the file's contents or null if the file could not be opened
     */
    public static String getResourceFileAsString(String fileName) {
        try {
            return Resources.toString(Resources.getResource(fileName), Charset.defaultCharset());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
