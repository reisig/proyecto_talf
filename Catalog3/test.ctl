ruta = "C:\Users\Luis\Music\test\";

foreach (file in ruta){
	genre = file.Genre;
	create(genre, ruta);
}