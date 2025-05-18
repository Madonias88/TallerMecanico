using Microsoft.AspNetCore.Mvc;
using TALLERMECANICO.Models;
using System.Collections.Generic;
using System.Linq;

namespace TALLERMECANICO.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class MecanicosController : ControllerBase
    {
        private static readonly List<Mecanicos> _mecanicos = new()
        {
            new Mecanicos { Id = 1, Nombre = "Juan", Apellido = "Pérez", Especialidad = "Mecaninca General", Direccion = "Calle 123", Telefono = "33445566", CorreoElectronico = "juanpe@taller.com", Disponible = true },
            new Mecanicos { Id = 2, Nombre = "Pedro", Apellido = "García", Especialidad = "Electromecanica", Direccion = "Avenida 456", Telefono = "44556677", CorreoElectronico = "anaga@taller.com", Disponible = true }
        };

        [HttpGet]
        public ActionResult<IEnumerable<Mecanicos>> Get() => Ok(_mecanicos);


    }
}



