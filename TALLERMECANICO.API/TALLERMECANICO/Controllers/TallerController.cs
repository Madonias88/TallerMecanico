using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;

namespace TALLERMECANICO.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class TallerController : ControllerBase
    {
        private static readonly Taller _taller = new Taller
        {
            Nombre = "Taller Mecánico Central",
            Direccion = "Av. Principal 123",
            Telefono = "555-1234",
            HorarioAtencion = "Lunes a Viernes 8:00-18:00",
            Servicios = new List<string> { "Cambio de aceite", "Alineación", "Balanceo" }
        };

        [HttpGet]
        public ActionResult<Taller> Get()
        {
            return Ok(_taller);
        }
    }

}
