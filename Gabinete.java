package Atv1Unid2;

public class Gabinete extends Conexão<PlugUSB>{

    @Override
    public String conecta(PlugUSB plug) {
        return plug.obtemConexao() + getNomeRede();
    }

    @Override
    public String getNomeRede() {
        return "Gabinete com entrada USB";
    }
}
