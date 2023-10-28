import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Mission1 {
    public static void main(String[] args) {

        StringBuilder html = new StringBuilder();
        html.append("<!DOCTYPE html>");
        html.append("<html lang=\"utf-8\">");
        html.append("<head>");
        html.append("    <meta charset=\"UTF-8\">");
        html.append("    <style>");
        html.append("        table { border-collapse: collapse; width: 100%;}");
        html.append("        th, td { border: solid 1px #000;}");
        html.append("    </style>");
        html.append("</head>");
        html.append("<body>");
        html.append("    <h1>자바 환경정보</h1>");
        html.append("    <table>");
        html.append("        <tr>");
        html.append("            <th>키</th>");
        html.append("            <th></th>");
        html.append("        </tr>");

        for (Object k: System.getProperties().keySet()) {
            String key = k.toString();
            String value = System.getProperty(key);
            html.append("     <tr>");
            html.append("         <td>").append(key).append("</td>");
            html.append("         <td>").append(value).append("</td>");
            html.append("     </tr>");
        }
        html.append("    </table>");
        html.append("</body>");
        html.append("</html>");

        try {
            File file = new File("index.html");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(html.toString());
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}