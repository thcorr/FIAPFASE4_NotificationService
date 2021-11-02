# FIAPFASE4_NotificationService

1. Uma vez que o servico https://github.com/thcorr/FIAPFASE4_PurchaseService estiver online, ao disparar criacao ou updates nas purchases, este servico faz o papel de listener da fila rabbitmq criada.
2. Vai disparar mensagens via System.out.println() de acordo com o status recebido.
3. Pode ser adaptado para tomar acoes mais concretas de acordo com o status recebido.
4. Servico disponibilizado no enderco/porta: http://localhost:7088 - Nao ha endpoints
