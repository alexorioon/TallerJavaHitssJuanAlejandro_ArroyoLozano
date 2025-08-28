package ejercicios.abstractos.SistemaPedidos.enums;

public enum OrderStatus {
    NEW {
        @Override
        public String mensaje() {
            return "Pedido creado";
        }
    },
    PROCESSING {
        @Override
        public String mensaje() {
            return "Pedido en proceso";
        }
    },
    SHIPPED {
        @Override
        public String mensaje() {
            return "Pedido enviado";
        }
    },
    DELIVERED {
        @Override
        public String mensaje() {
            return "Pedido entregado";
        }
    },
    CANCELLED {
        @Override
        public String mensaje() {
            return "Pedido cancelado";
        }
    };
    
    //  Método abstracto que cada constante debe implementar
    public abstract String mensaje();
}
