/**
 * Copyright (C) 2011 Darien Hager
 *
 * This code is part of the "PackBSP" project, and is licensed under
 * a Creative Commons Attribution-ShareAlike 3.0 Unported License. For
 * either a summary of conditions or the full legal text, please visit:
 *
 * http://creativecommons.org/licenses/by-sa/3.0/
 *
 * Permissions beyond the scope of this license may be available
 * at http://technofovea.com/ .
 */
package com.technofovea.packbsp;

/**
 * Thrown when an error occurs in PackBSP which can be caught and recovered
 * -from at a fairly high level in the application. Often used in conjunction
 * with error dialogs shown to the user.
 * @author Darien Hager
 */
public class PackbspException extends Exception{

    public PackbspException(Throwable cause) {
        super(cause);
    }

    public PackbspException(String message, Throwable cause) {
        super(message, cause);
    }

    public PackbspException(String message) {
        super(message);
    }

    public PackbspException() {
    }

}
