$i = 0;
foreach $file inside "C:\\Users\\Luis\\Music\\Musica"{
	if $file.Extension == "pdf"{
		print $file.Name;
		$i = $i+1;
	};
};
print $i;

