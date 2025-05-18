using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;

namespace TALLERMECANICO.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class TurnosController : ControllerBase
    {
        private static readonly List<Turno> _turnos = new()
        {
            new Turno { Id = 1, Fecha = DateTime.Now, ClienteNombre = "Pedro Gómez", Servicio = "Cambio de aceite", Estado = "Pendiente" },
            new Turno { Id = 2, Fecha = DateTime.Now.AddDays(1), ClienteNombre = "Laura Ruiz", Servicio = "Alineación", Estado = "Confirmado" }
        };

        [HttpGet]
        public ActionResult<IEnumerable<Turno>> Get()
        {
            return Ok(_turnos);
        }
    }

  
}
