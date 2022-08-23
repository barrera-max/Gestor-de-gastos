import java.util.Scanner;

public class ListaCompras {
    private Compras compras;
    private Compras[] lista;

    public Compras getGasto() {
        return compras;
    }

    public Compras[] getLista() {
        return lista;
    }

    public void setLista(int n) {
        lista = new Compras[n];
    }

    public void generate()
    {


        for(int i=0; i< lista.length; i++) {
            Scanner sc = new Scanner(System.in);
            Scanner str = new Scanner(System.in);
            System.out.println("GASTO[" + (i+1) +"]");
            System.out.print("Ingrese el codigo: ");
            int cod = sc.nextInt();
            System.out.print("\nIngrese la descripcion: ");
            String desc = str.nextLine();
            System.out.print("\nIngrese el mes de la compra: ");
            int mes = sc.nextInt();
            System.out.print("\nIngrese la sucursal: ");
            int suc = sc.nextInt();
            System.out.println("\nIngrese el importe");
            float imp = sc.nextFloat();
            lista[i] = new Compras(cod, desc, mes, suc, imp);
        }
    }

    public void ordenar()
    {
        for(int i=0; i< (lista.length - 1); i++)
        {
            for(int j=1; j < lista.length; j ++)
            {
                if(lista[i].getImporte() > lista[j].getImporte())
                {
                    Compras aux =  lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }
            }
        }
    }

    public void search(int c)
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i< lista.length;i++)
        {
            if(lista[i].getCodigo() == c)
            {
                System.out.println("Gasto encontrado!!!");
                System.out.print("Ingrese el nuevo importe: ");
                float nimp = sc.nextFloat();
                lista[i].setImporte(nimp);
                System.out.println("El cambio queda asi....");
                System.out.println(lista[i].toString());
            }
        }
    }

    public void compraMesSuc()
    {
        float mat[][] = new float[3][12];
        int f, c;
        for(int i=0; i< lista.length;i++)
        {
            f = lista[i].getSucursal();
            c = lista[i].getMes();
            mat[f][c] += lista[i].getImporte();
        }

        for(int i=0; i< mat.length;i++)
        {
            for(int j=0; j< mat[i].length;j++)
            {
                if(mat[i][j] !=0)
                {
                    System.out.println("\nIMPORTES: " + "SUCURSAL " + i + ", MES " + j + " TOTAL $" + mat[i][j]);
                }
            }
        }
    }

    public String toString()
    {
    return
            "| COMPRA: \n"+
            " CODIGO: " + compras.getCodigo() + " DESCRIPCION: " + compras.getDescripcion() + " MES: " + compras.getMes() +
            " SUCURSAL: " + compras.getSucursal() + " IMPORTE: $"+ compras.getImporte() + "|";
    }

    public void mostrarLista()
    {
        for(int i = 0; i< lista.length; i++)
        {
            System.out.println(lista[i].toString());
        }
    }



}
