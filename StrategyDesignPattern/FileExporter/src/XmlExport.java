import java.util.List;

public class XmlExport implements ExportStrategy{
    @Override
    public String export(List<String> rows) {
        StringBuilder sb=new StringBuilder();
        sb.append("<rows> \n");
        for(String row:rows){
           sb.append(" <row> ");
           sb.append(row);
           sb.append(" </row>\n");
        }
        sb.append("</rows>");
        return sb.toString();
    }
}
