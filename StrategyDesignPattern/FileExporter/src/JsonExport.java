import java.util.List;

public class JsonExport implements ExportStrategy{
    @Override
    public String export(List<String> rows) {
        StringBuilder sb=new StringBuilder();
        sb.append("[ \n");
        String result=String.join(",\n",rows);
            sb.append(result);
        sb.append("\n]");
        return sb.toString();
    }
}
