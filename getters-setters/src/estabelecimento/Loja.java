package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.LaserJet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Loja {
  public static void main(String[] args) {
    EquipamentoMultifuncional em = new EquipamentoMultifuncional();
    Impressora impressora = new Deskjet();
    Copiadora copiadora = em;
    
    em.imprimir();
    em.copiar();

    impressora.imprimir();
    copiadora.copiar();
    
  }
}
