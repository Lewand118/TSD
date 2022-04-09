using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Yummy.Models;

namespace Yummy.Controllers
{
    public class RecipesController : Controller
    {
        public static List<Recipes> recipesList = new List<Recipes>();
        // GET: RecipesController1
        public ActionResult Index()
        {
            return View(recipesList.ToList());
        }

        // GET: RecipesController1/Details/5
        public ActionResult Details(int Id)
        {
            return View(recipesList.Where(r => r.Id == Id).First());
        }

        // GET: RecipesController1/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: RecipesController1/Create
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create(Recipes recipes)
        {
            try
            {
                recipesList.Add(recipes);
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: RecipesController1/Edit/5
        public ActionResult Edit(int id)
        {
            return View(recipesList.Where(r => r.Id == id).First());
        }

        // POST: RecipesController1/Edit/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit(int id, Recipes recipes)
        {
            try
            {
                recipesList[id] = recipes;
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: RecipesController1/Delete/5
        public ActionResult Delete(int id)
        {
            return View(recipesList.Where(r => r.Id == id).First());
        }

        // POST: RecipesController1/Delete/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Delete(int id, IFormCollection collection)
        {
            try
            {
                recipesList.Remove(recipesList.Where(r => r.Id == id).First());
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }
    }
}
