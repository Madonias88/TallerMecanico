namespace TALLERMECANICO.Models
{
    public class Mecanicos
    {
        public int Id { get; set; }
        public required string Nombre { get; set; }
        public required string Apellido { get; set; }
        public required string Especialidad { get; set; }
        public required string Direccion { get; set; }
        public required string Telefono { get; set; }
        public required string CorreoElectronico { get; set; }
        public bool Disponible { get; internal set; }
    }
    
    
}
