package catalog;

import enums.MediaEnum;
import media.CompactDisc;
import media.Media;
import media.Tape;
import media.VinilRecord;

import java.io.*;

public class FileCatalog extends CatalogAbstract{
    private String DELIMITER = ";";

    public FileCatalog(){
        readFile();
    }

    private void saveFile(){
        try
        {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("media.csv",false), "UTF-8"));
            for (int i = 0; i<size; i++) {
                Media media = mediaCollection[i];
                StringBuffer oneLine = new StringBuffer();
                oneLine.append(media.getName());
                oneLine.append(DELIMITER);
                oneLine.append(media.getAuthor());
                oneLine.append(DELIMITER);
                oneLine.append(media.getYear());
                oneLine.append(DELIMITER);
                oneLine.append(media.getComment());
                oneLine.append(DELIMITER);
                oneLine.append(media.getRating());
                oneLine.append(DELIMITER);
                if(media instanceof CompactDisc){
                    oneLine.append(MediaEnum.COMPACT_DISC);
                } else if(media instanceof Tape){
                    oneLine.append(MediaEnum.TAPE);
                } else if(media instanceof VinilRecord){
                    oneLine.append(MediaEnum.VINYL_RECORD);
                }
                bw.write(oneLine.toString());
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдено");
        } catch (UnsupportedEncodingException e) {
            System.out.println("Проблема з кодуванням");
        } catch (IOException e) {
            System.out.println("Проблема запису у файл");
        }
    }

    private void readFile(){
        try (BufferedReader br = new BufferedReader(new
                FileReader("media.csv"))) {
            String line;
            String name;
            String author;
            int year;
            String comment;
            double rating;
            MediaEnum mediaEnum;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(DELIMITER);
                name = values[0];
                author = values[1];
                year = Integer.parseInt(values[2]);
                comment = values[3];
                rating = Double.parseDouble(values[4]);
                mediaEnum = MediaEnum.valueOf(values[5]);
                Media media = null;
                if(mediaEnum.equals(MediaEnum.COMPACT_DISC)){
                    media = new
                            CompactDisc(name,author,year,comment,rating);
                } else if(mediaEnum.equals(MediaEnum.VINYL_RECORD)){
                    media = new Tape(name,author,year,comment,rating);
                } else if(mediaEnum.equals(MediaEnum.TAPE)){
                    media = new Tape(name,author,year,comment,rating);
                }
                if(media != null){
                    mediaCollection[size]=media;
                    size++;
                    System.out.println("Прочитано запис");//використовується
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдено");
        } catch (IOException e) {
            System.out.println("Помилка читання");
        }
    }


    @Override
    public void addMedia(Media media) {
        mediaCollection[size] = media;
        size++;
        saveFile();
    }

}
