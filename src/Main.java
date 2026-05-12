import com.dbjb.desafio.dominio.Bootcamp;
import com.dbjb.desafio.dominio.Curso;
import com.dbjb.desafio.dominio.Dev;
import com.dbjb.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("José");
        dev1.inscreverBootcamp(bootcamp);
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos inscritos José " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos José " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXP());

        System.out.println("-------------");
        Dev dev2 = new Dev();
        dev2.setNome("Maria");
        dev2.inscreverBootcamp(bootcamp);
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos inscritos Maria " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Maria " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXP());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);
    }
}
