using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;
using System.Linq;

namespace TALLERMECANICO.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class RepuestosController : ControllerBase
    {
        private static readonly List<Repuesto> _repuestos = new()
        {
            new Repuesto { Id = 1, Nombre = "Filtro de aceite", Marca = "Bosch", Precio = 120.50m, Stock = 10 },
            new Repuesto { Id = 2, Nombre = "Bujía", Marca = "NGK", Precio = 45.00m, Stock = 25 }
        };

        [HttpGet]
        public ActionResult<IEnumerable<Repuesto>> Get() => Ok(_repuestos);


    }
}
