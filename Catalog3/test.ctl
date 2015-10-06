music = "C:\Users\Luis\Music\test";

foreach (file in music){
	name = file.Genre;
	path = create(name, music);
	move (file, path);
}
