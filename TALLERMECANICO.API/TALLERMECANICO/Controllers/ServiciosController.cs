using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;

namespace TALLERMECANICO.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class ServiciosController : ControllerBase
    {
        private static readonly List<Servicio> _servicios = new()
        {
            new Servicio { Id = 1, Nombre = "Cambio de aceite", Descripcion = "Cambio de aceite de motor", Precio = 500.00m, DuracionMinutos = 30 },
            new Servicio { Id = 2, Nombre = "Alineación", Descripcion = "Alineación y balanceo", Precio = 800.00m, DuracionMinutos = 45 }
        };

        [HttpGet]
        public ActionResult<IEnumerable<Servicio>> Get()
        {
            return Ok(_servicios);
        }
    }

  
}
