package repositorio;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import modelos.Tripulada;
import modelos.VehiculoLanzadera;
import modelos.NoTripulada;
import org.bson.Document;
import org.bson.conversions.Bson;

import static com.mongodb.client.model.Filters.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static com.mongodb.client.model.Filters.gte;

public class navesRepositorio {

    static Properties properties = new Properties();
    private static MongoClient mongo;


    public static MongoClient crearConexion() {
        try {
            properties.load(new FileInputStream(new File("src/main/resources/propiedades.properties")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        MongoClientURI mongoUri = new MongoClientURI(properties.getProperty("mongo.uri"));
        mongo = new MongoClient(mongoUri);
        return mongo;
    }

    public static void insertNaveTripulada(Tripulada tripulada) {
        MongoDatabase database = mongo.getDatabase(properties.getProperty("mongo.db"));
        MongoCollection<Document> collection = database.getCollection(properties.getProperty("mongo.collection"));

        collection.insertOne(
                new Document("id", tripulada.getid())
                        .append("nacionalidad", tripulada.getnacionalidad())
                        .append("peso", tripulada.getpeso())
                        .append("numeroPasajeros", tripulada.getnumeroPasajeros())
                        .append("tamano", tripulada.gettamano())
                        .append("reutilizable", tripulada.isreutilizable())
                        .append("Modelo", "Tripulada")
        );
    }

    public static void insertNaveNoTripulada(NoTripulada notripulada) {
        MongoDatabase database = mongo.getDatabase(properties.getProperty("mongo.db"));
        MongoCollection<Document> collection = database.getCollection(properties.getProperty("mongo.collection"));
        collection.insertOne(
                new Document("id", notripulada.getid())
                        .append("nacionalidad", notripulada.getnacionalidad())
                        .append("peso", notripulada.getpeso())
                        .append("tamano", notripulada.gettamano())
                        .append("reutilizable", notripulada.isreutilizable())
                        .append("Modelo", "No tripulada")
        );
    }

    public static void insertVehiculoLanzadera(VehiculoLanzadera vehiculolanzadera) {
        MongoDatabase database = mongo.getDatabase(properties.getProperty("mongo.db"));
        MongoCollection<Document> collection = database.getCollection(properties.getProperty("mongo.collection"));
        collection.insertOne(
                new Document("id", vehiculolanzadera.getid())
                        .append("nacionalidad", vehiculolanzadera.getnacionalidad())
                        .append("peso", vehiculolanzadera.getpeso())
                        .append("tamano", vehiculolanzadera.gettamano())
                        .append("reutilizable", vehiculolanzadera.isreutilizable())
                        .append("Modelo", "Vehiculo Lanzadera")
        );

    }

    public static void consultarNavesID(int id) {
        MongoDatabase database = mongo.getDatabase(properties.getProperty("mongo.db"));
        MongoCollection<Document> collection = database.getCollection(properties.getProperty("mongo.collection"));
        FindIterable<Document> cursor = collection.find();
        Bson equalComparison = eq("id", id);
        List<String> resultado = new ArrayList<>();
        cursor.filter(equalComparison).forEach((Block<? super Document>) doc -> resultado.add(doc.toJson()));
        if (resultado.size() != 0) {
            for (String result : resultado) {
                System.out.println(result);
            }
        } else {
            System.out.print("No se encontraron resultados\n");
        }
    }

    public static void consultarNavesPesoExacto(int peso) {
        MongoDatabase database = mongo.getDatabase(properties.getProperty("mongo.db"));
        MongoCollection<Document> collection = database.getCollection(properties.getProperty("mongo.collection"));
        FindIterable<Document> cursor = collection.find();
        Bson ComparacionIguales = eq("peso", peso);
        List<String> resultado = new ArrayList<>();
        cursor.filter(ComparacionIguales).forEach((Block<? super Document>) doc -> resultado.add(doc.toJson()));
        if (resultado.size() != 0) {
            for (String result : resultado) {
                System.out.println(result);
            }
        } else {
            System.out.print("No se encontraron resultados\n");
        }
    }

    public static void consultarNavesPesoMayora(int peso) {
        MongoDatabase database = mongo.getDatabase(properties.getProperty("mongo.db"));
        MongoCollection<Document> collection = database.getCollection(properties.getProperty("mongo.collection"));
        FindIterable<Document> cursor = collection.find();
        Bson ComparacionMayorA = gte("peso", peso);
        List<String> resultado = new ArrayList<>();
        cursor.filter(ComparacionMayorA).forEach((Block<? super Document>) doc -> resultado.add(doc.toJson()));
        if (resultado.size() != 0) {
            for (String result : resultado) {
                System.out.println(result);
            }
        } else {
            System.out.print("No se encontraron resultados\n");
        }
    }

    public static void consultarNavesPesoMenora(int peso) {
        MongoDatabase database = mongo.getDatabase(properties.getProperty("mongo.db"));
        MongoCollection<Document> collection = database.getCollection(properties.getProperty("mongo.collection"));
        FindIterable<Document> cursor = collection.find();
        Bson ComparacionMenorA = lte("peso", peso);
        List<String> resultado = new ArrayList<>();
        cursor.filter(ComparacionMenorA).forEach((Block<? super Document>) doc -> resultado.add(doc.toJson()));
        if (resultado.size() != 0) {
            for (String result : resultado) {
                System.out.println(result);
            }
        } else {
            System.out.print("No se encontraron resultados\n");
        }
    }

    public static void consultarNavesTamanoExacto(int tamano) {
        MongoDatabase database = mongo.getDatabase(properties.getProperty("mongo.db"));
        MongoCollection<Document> collection = database.getCollection(properties.getProperty("mongo.collection"));
        FindIterable<Document> cursor = collection.find();
        Bson ComparacionIguales = eq("tamano", tamano);
        List<String> resultado = new ArrayList<>();
        cursor.filter(ComparacionIguales).forEach((Block<? super Document>) doc -> resultado.add(doc.toJson()));
        if (resultado.size() != 0) {
            for (String result : resultado) {
                System.out.println(result);
            }
        } else {
            System.out.print("No se encontraron resultados\n");
        }
    }

    public static void consultarNavesTamanoMayora(int tamano) {
        MongoDatabase database = mongo.getDatabase(properties.getProperty("mongo.db"));
        MongoCollection<Document> collection = database.getCollection(properties.getProperty("mongo.collection"));
        FindIterable<Document> cursor = collection.find();
        Bson ComparacionMayorA = gte("tamano", tamano);
        List<String> resultado = new ArrayList<>();
        cursor.filter(ComparacionMayorA).forEach((Block<? super Document>) doc -> resultado.add(doc.toJson()));
        if (resultado.size() != 0) {
            for (String result : resultado) {
                System.out.println(result);
            }
        } else {
            System.out.print("No se encontraron resultados\n");
        }
    }

    public static void consultarNavesTamanoMenora(int tamano) {
        MongoDatabase database = mongo.getDatabase(properties.getProperty("mongo.db"));
        MongoCollection<Document> collection = database.getCollection(properties.getProperty("mongo.collection"));
        FindIterable<Document> cursor = collection.find();
        Bson ComparacionMenorA = lte("tamano", tamano);
        List<String> resultado = new ArrayList<>();
        cursor.filter(ComparacionMenorA).forEach((Block<? super Document>) doc -> resultado.add(doc.toJson()));
        if (resultado.size() != 0) {
            for (String result : resultado) {
                System.out.println(result);
            }
        } else {
            System.out.print("No se encontraron resultados\n");
        }
    }

    public static void consultarNavesNacionalidad(String nacionalidad) {
        MongoDatabase database = mongo.getDatabase(properties.getProperty("mongo.db"));
        MongoCollection<Document> collection = database.getCollection(properties.getProperty("mongo.collection"));
        FindIterable<Document> cursor = collection.find();
        Bson equalComparison = eq("nacionalidad", nacionalidad);
        List<String> resultado = new ArrayList<>();
        cursor.filter(equalComparison).forEach((Block<? super Document>) doc -> resultado.add(doc.toJson()));
        if (resultado.size() != 0) {
            for (String result : resultado) {
                System.out.println(result);
            }
        } else {
            System.out.print("No se encontraron resultados\n");
        }
    }

    public static void consultarTipoNaveTripulada() {
        MongoDatabase database = mongo.getDatabase(properties.getProperty("mongo.db"));
        MongoCollection<Document> collection = database.getCollection(properties.getProperty("mongo.collection"));
        FindIterable<Document> cursor = collection.find();
        Bson equalComparison = eq("Modelo", "Tripulada");
        List<String> resultado = new ArrayList<>();
        cursor.filter(equalComparison).forEach((Block<? super Document>) doc -> resultado.add(doc.toJson()));
        if (resultado.size() != 0) {
            for (String result : resultado) {
                System.out.println(result);
            }
        } else {
            System.out.print("No se encontraron resultados\n");
        }
    }

    public static void consultarTipoNaveNoTripulada() {
        MongoDatabase database = mongo.getDatabase(properties.getProperty("mongo.db"));
        MongoCollection<Document> collection = database.getCollection(properties.getProperty("mongo.collection"));
        FindIterable<Document> cursor = collection.find();
        Bson equalComparison = eq("Modelo", "No tripulada");
        List<String> resultado = new ArrayList<>();
        cursor.filter(equalComparison).forEach((Block<? super Document>) doc -> resultado.add(doc.toJson()));
        if (resultado.size() != 0) {
            for (String result : resultado) {
                System.out.println(result);
            }
        } else {
            System.out.print("No se encontraron resultados\n");
        }
    }

    public static void consultarTipoNaveVehiculoLanzadera() {
        MongoDatabase database = mongo.getDatabase(properties.getProperty("mongo.db"));
        MongoCollection<Document> collection = database.getCollection(properties.getProperty("mongo.collection"));
        FindIterable<Document> cursor = collection.find();
        Bson equalComparison = eq("Modelo", "Vehiculo Lanzadera");
        List<String> resultado = new ArrayList<>();
        cursor.filter(equalComparison).forEach((Block<? super Document>) doc -> resultado.add(doc.toJson()));
        if (resultado.size() != 0) {
            for (String result : resultado) {
                System.out.println(result);
            }
        } else {
            System.out.print("No se encontraron resultados\n");
        }
    }

    public static void consultarNavesPasajerosExacto(int numeroPasajeros) {
        MongoDatabase database = mongo.getDatabase(properties.getProperty("mongo.db"));
        MongoCollection<Document> collection = database.getCollection(properties.getProperty("mongo.collection"));
        FindIterable<Document> cursor = collection.find();
        Bson ComparacionIguales = eq("numeroPasajeros", numeroPasajeros);
        List<String> resultado = new ArrayList<>();
        cursor.filter(ComparacionIguales).forEach((Block<? super Document>) doc -> resultado.add(doc.toJson()));
        if (resultado.size() != 0) {
            for (String result : resultado) {
                System.out.println(result);
            }
        } else {
            System.out.print("No se encontraron resultados\n");
        }
    }

    public static void consultarNavesPasajerosMayora(int numeroPasajeros) {
        MongoDatabase database = mongo.getDatabase(properties.getProperty("mongo.db"));
        MongoCollection<Document> collection = database.getCollection(properties.getProperty("mongo.collection"));
        FindIterable<Document> cursor = collection.find();
        Bson ComparacionMayorA = gte("numeroPasajeros", numeroPasajeros);
        List<String> resultado = new ArrayList<>();
        cursor.filter(ComparacionMayorA).forEach((Block<? super Document>) doc -> resultado.add(doc.toJson()));
        if (resultado.size() != 0) {
            for (String result : resultado) {
                System.out.println(result);
            }
        } else {
            System.out.print("No se encontraron resultados\n");
        }
    }

    public static void consultarNavesPasajerosMenora(int numeroPasajeros) {
        MongoDatabase database = mongo.getDatabase(properties.getProperty("mongo.db"));
        MongoCollection<Document> collection = database.getCollection(properties.getProperty("mongo.collection"));
        FindIterable<Document> cursor = collection.find();
        Bson ComparacionMenorA = lte("numeroPasajeros", numeroPasajeros);
        List<String> resultado = new ArrayList<>();
        cursor.filter(ComparacionMenorA).forEach((Block<? super Document>) doc -> resultado.add(doc.toJson()));
        if (resultado.size() != 0) {
            for (String result : resultado) {
                System.out.println(result);
            }
        } else {
            System.out.print("No se encontraron resultados\n");
        }
    }
}