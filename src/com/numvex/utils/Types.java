
public final class Types {
    // define types strings
    public final String DOUBLE = "double",
            STRING = "string",
            INT = "integer",
            BOOLEAN = "boolean";
    public static final String SUPPORTED_TYPES[] = {
            Types.DOUBLE,
            Types.INT,
            Types.STRING,
            Types.BOOLEAN
    };

    public static boolean isAllowed(String Type) {
        for (String type : Types.SUPPORTED_TYPES) {
            if (type.contains(Type) || type.equals(Type)) {
                return true;
            }
        }
        return false;
    }
    public static String getSupportedTypes(){
        // convert the list of SUPPORTED_TYPES to string
        String output = "";
        String sep = ",";
        for(String type : Types.SUPPORTED_TYPES){
            output += type ;
            output += sep;
        }
        return output;
    }
}