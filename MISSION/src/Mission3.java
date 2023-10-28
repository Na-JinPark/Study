
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Mission3 {
    public static class Pager {
        final long totalContent;
        final long contentPerpage;
        final long blockDisplay;

        public Pager(long totalCount, long contentPerpage, long blockDisplay) {
            this.totalContent = totalCount;
            this.contentPerpage = contentPerpage;
            this.blockDisplay = blockDisplay;
        }

        public String html(long pageIndex) {
            long totalPage;
            StringBuilder html = new StringBuilder();

            totalPage = totalContent / contentPerpage;

            if (totalContent % contentPerpage != 0) {
                totalPage++;
            }

            html.append("<style> .on { color : red} </style>").append("\n")
                .append("<a href='#'>[처음]</a>\n")
                .append("<a href='#'>[이전]</a>\n");

            for (long i = (int)(pageIndex - 1) / this.blockDisplay * this.blockDisplay + 1; i <= Math.min(((int)(pageIndex - 1) / this.blockDisplay + 1) * this.blockDisplay, totalPage); i++) {
                if (i == pageIndex) {
                    html.append("<a href='#' class='on'>").append(i).append("</a>\n");
                } else {
                    html.append("<a href='#'>").append(i).append("</a>\n");
                }
            }

            html.append("<a href='#'>[다음]</a>").append("</a>\n")
               .append("<a href='#'>[마지막]</a>");

            return html.toString();
        }
    }
    public static void main(String[] args) {
        long totalCount = 127;
        long showPerpage = 10;
        long blockDisplay = 10;
        long pageIndex = 1;

        Pager pager = new Pager(totalCount, showPerpage, blockDisplay);
        System.out.println(pager.html(pageIndex));


        try {
            File file = new File("index.html");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(pager.html(pageIndex));
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}