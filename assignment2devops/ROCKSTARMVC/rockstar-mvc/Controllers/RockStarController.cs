using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Logging;
using asp.net.mvc.Models;

namespace asp.net.mvc.Controllers
{
    public class RockStarController : Controller
    {
        private readonly ILogger<RockStarController> _logger;
        //private MusicModel myModel = new MusicModel();

        public RockStarController(ILogger<RockStarController> logger)
        {
            _logger = logger;
        }

        public IActionResult Index()
        {
            return View();
        }

        public IActionResult GeorgeMichael()
        {
            return View();
        }

        public IActionResult GeorgeMichael2()
        {
            return View();
        }

        public IActionResult Queen()
        {
            return View();
        }

        public IActionResult Queen2()
        {
            return View();
        }

        public IActionResult Farmhouse()
        {
            return View();
        }
         public IActionResult Tiktok()
        {
            return View();
        }
        public IActionResult Privacy()
        {
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
