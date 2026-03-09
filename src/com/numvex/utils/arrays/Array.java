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
        // if not a supported type
        if (!Types.isAllowed(Type)){
            Types.TypeError(Type);
        }
        // check for elements types : all should be the same as the passed 'type' argument
        for(int i = 0 ; i < elements.length;i++){
            if (!Types.CheckType(elements[i] , Type)){
                Types.ElementTypeError();
            }
        }
    }
