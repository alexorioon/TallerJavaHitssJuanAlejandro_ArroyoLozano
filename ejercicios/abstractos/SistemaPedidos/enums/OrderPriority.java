package ejercicios.abstractos.SistemaPedidos.enums;

public enum OrderPriority {
    LOW {
        @Override
        public int priority() {
            return 1;
        }
    },
    MEDIUM {
        @Override
        public int priority() {
            return 2;
        }
    },
    HIGH {
        @Override
        public int priority() {
            return 3;
        }
    };

    //  Método abstracto que cada constante debe implementar
    public abstract int priority();
}
