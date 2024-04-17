import java.time.LocalDate;

public class task {
    
    private String descrip;
    private String name;
    private LocalDate inicialDate;
    private LocalDate finalDate;

    task(String des, String title, LocalDate iDate, LocalDate fDate){
        descrip=des;
        name=title;
        inicialDate=iDate;
        finalDate=fDate;     
    }

}
