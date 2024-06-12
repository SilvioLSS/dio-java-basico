package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> TarefaList;

    public ListaTarefa(){
        this.TarefaList = new ArrayList<>();
    }

    public void adcionarTarefa(String descricao){
        TarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : TarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        TarefaList.removeAll(tarefasParaRemover);
    }
    

    public int obterNumeroTotalTarefas(){
        return TarefaList.size();
    } 

    public void obterDescricoesTarefas(){
        System.out.println(TarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adcionarTarefa(("Tarefa 1"));
        listaTarefa.adcionarTarefa(("Tarefa 2"));
        listaTarefa.adcionarTarefa(("Tarefa 2"));
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }

}
