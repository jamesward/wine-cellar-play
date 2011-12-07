package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class WineController extends Controller {

    private static void renderJsonOrXml(Object o) {
        if (request.format.equals("json")) {
            renderJSON(o);
        }
        else if (request.format.equals("xml")) {
            renderXml(o);
        }
    }

    public static void findAll() {
        renderJsonOrXml(Wine.findAll());
    }

    public static void findByName(String name) {
        renderJsonOrXml(Wine.find("byName", name).fetch());
    }

    public static void findById(Long id) {
        renderJsonOrXml(Wine.findById(id));
    }

    public static void create(Wine wine) {
        wine.save();
        renderJsonOrXml(wine);
    }

    public static void update(Long id, Wine wine) {
        wine.save();
        renderJsonOrXml(wine);
    }

    public static void remove(Long id) {
        ((Wine)Wine.findById(id)).delete();
    }

}
