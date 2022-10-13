package Atv1Unid2;

public class Adaptador extends Teclado {
    public String conecta(PlugUSB p ){
        return p.obtemConexao() + getNomeRede();
    }
}
