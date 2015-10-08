musica = "C:\Users\Luis\Music\Musica";
i = 0;

foreach(file inside musica){
	ext = file.Extension;
	if(ext == "mp3"){
		i = i+1;
	}
}
print ("dentro de la carpeta "+musica+" hay "+i+" archivos mp3");