public class Principal {
    static void matar(EnemigoNormal enemigo) {
        System.out.println("Murió el enemigo normal");
    }
    static void matar(EnemigoBoss enemigo) {
        System.out.println("murio el enemigo boss");
    }
    static void matar(EnemigoFinalBoss enemigo) {
        System.out.println("Murió el enemigo final boss");
    }
    public static void main(String[] args) {
        EnemigoNormal stormTropper1 = new EnemigoNormal();
        EnemigoNormal stormTropper2 = new EnemigoNormal();
        EnemigoFinalBoss darthVader = new EnemigoFinalBoss();
        matar(stormTropper2);
    }
}

class Armadura {
    String tipoArmadura;
    int durabilidadArmadura;
    int calidadArmadura;

}

class EnemigoNormal extends Enemigo {
    float calculapotenciagolpe() {
        return golpeBase * vida;
    }
}

class EnemigoBoss extends Enemigo {
    float calculapotenciagolpe() {
        return golpeBase * 8 * vida;
    }
}

class EnemigoFinalBoss extends Enemigo {
    float calculapotenciagolpe() {
        return golpeBase * 20 * vida;
    }
}

abstract class Enemigo {

    Armadura armadura = new Armadura();

    float vida = 100; // vida del enemigo
    float golpeBase = 40;
    private boolean muerto = false;

    enum TipoEnemigo {
        NORMAL, BOSS, FINAL_BOSS
    };

    TipoEnemigo tipoEnemigo;

    abstract float calculapotenciagolpe();

    boolean estaMuerto() {
        return muerto;
    }

}
