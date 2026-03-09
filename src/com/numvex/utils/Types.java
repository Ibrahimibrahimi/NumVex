
public final class Types {
    // define types strings
    public static final String DOUBLE = "double",
            STRING = "string",
            INT = "integer",
            BOOLEAN = "boolean",
            FLOAT = "float",
            LONG = "long";
    public static final String[] SUPPORTED_TYPES = {
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

    public static String getSupportedTypes() {
        // convert the list of SUPPORTED_TYPES to string
        String output = "";
        String sep = ",";
        for (String type : Types.SUPPORTED_TYPES) {
            output += type;
            output += sep;
        }
        return output;
    }

    public static void TypeError(String type) {
        throw new IllegalArgumentException("Unsupported type: \"" + type + "\". " +
                "Supported types:" + Types.getSupportedTypes() + "");
    }
    public static void ElementTypeError(String type){

    }

    public static boolean CheckType(Object element, String type) {
        switch (type) {
            case Types.INT:
                return element instanceof Integer;
            case Types.DOUBLE:
                return element instanceof Double;
            case Types.FLOAT:
                return element instanceof Float;
            case Types.LONG:
                return element instanceof Long;
            case Types.STRING:
                return element instanceof String;
            case Types.BOOLEAN:
                return element instanceof Boolean;
            default:
                return false;
        }
    }
}