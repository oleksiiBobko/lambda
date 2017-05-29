package x.y.z;

public class Format {

    public static void main(String[] args) {
        
        
//        return String.format(
//                DocumentUtils.FORMAT_DIRECTIVE_TEMPLATE,
//                DocumentUtils.FORMAT_BOLD,
//                prefix + StringUtils.repeat(DelimiterBuilder.DELIMITER_SPACE_UNBREAKABLE, (Integer)formatParameters.get(
//                        DocumentProfileAwareModifier.CHARACTERS_IN_SIGNING_LINE) - prefix.length()));
        
        String output = String.format("__FORMAT_DIR_OPEN_$$%s$$%s$$_FORMAT_DIR_CLOSE__",
                "joe", 35);

    }

}
