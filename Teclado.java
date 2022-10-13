package Atv1Unid2;

public class Teclado extends Conexão<PlugPS2> {


    @Override
    public String conecta(PlugPS2 plug) {
        return plug.obtemConexao() + getNomeRede();
    }

    @Override
    public String getNomeRede() {
        return "Teclado com saída PS2";
    }
}
