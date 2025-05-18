public class Factura
{
    public int Id { get; set; }
    public DateTime Fecha { get; set; }
    public string ClienteNombre { get; set; }
    public decimal Total { get; set; }
    public List<string> Items { get; set; }
}