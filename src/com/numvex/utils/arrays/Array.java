/*
 * 
 * This class provides u to create an array of a given type:str
 * - structure of the constructor : 
 *      Array(type:Types.* , **elements)
 * - example : 
 *  Array test = new Array(Types.STRING , "ll","bb",...)
 */

package com.numvex; 
import com.numvex.utils.Types;


public class Array<T> {

    private final Object[] data;
    private final String type;
    private final size;

    private final String[] allowed_types = Types.SUPPORTED_TYPES;

    public Array(String Type , Object ..elements){
        if (!Types.isAllowed(Type)){
            throw new IllegalArgumentException("Unsupported type: \"" + type + "\". " +
                "Supported types:" + Types.getSupportedTypes() + ""
            );
        }
    }
