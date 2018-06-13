package io;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.RandomAccess;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Lesson1 {
    public static void main1(String[] args) throws IOException, ClassNotFoundException {
        // general
        DataOutput out;
        DataInput in;

        // generic read/write
        // how to read via stream
        FileInputStream fis = new FileInputStream("1.txt");
        // how to write via stream
        FileOutputStream fos = new FileOutputStream("1.txt");

        // specific data readWrite
        // read
        DataInputStream dis = new DataInputStream(fis);
        // write
        DataOutputStream dos = new DataOutputStream(fos);

        // if we want to bufferize
        BufferedInputStream bis = new BufferedInputStream(fis); // dis
        BufferedOutputStream bos = new BufferedOutputStream(fos); // dos

        // rewind feature
        PushbackInputStream pbis = new PushbackInputStream(fis);

        // unzip on the fly
        FileInputStream fileStreamZipped = new FileInputStream("1.zip");
        ZipInputStream zipins = new ZipInputStream(fileStreamZipped);
        DataInputStream dis_unzipped = new DataInputStream(zipins);

        // zip on the fly
        FileOutputStream fos2 = new FileOutputStream("out.zip");
        ZipOutputStream zipous = new ZipOutputStream(fos2);
        DataOutputStream dos2 = new DataOutputStream(zipous);

        // if we are dealing with TEXT only
        PrintWriter pw = new PrintWriter(new File("file_toWrite.txt"));
        PrintWriter pw2 = new PrintWriter(new FileOutputStream(new File("file_toWrite.txt")));
        //pw.write

        // how to read the file
        BufferedReader br = new BufferedReader(new FileReader(new File("1.txt")));
        String line = br.readLine();
        Stream<String> lines1 = br.lines();
        // how to wrire to the file
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("file.txt")));
        bw.write("hello");

        // how to read (is)
        Path path = Paths.get("file.txt");
        Charset cs = StandardCharsets.UTF_8;
        String s = new String(Files.readAllBytes(path), cs);
        List<String> sl = Files.readAllLines(path, cs);
        // large file (lazy load)
        Stream<String> lines = Files.lines(path, cs);

        /* randomAccess
            rws flushes the contents of the file and the modification date of the file.
            rwd flushes the contents of the file, but the modification date might not change until the file is closed.
            rw only flushes when you tell it to and doesn't change the modifcation date until you close the file.
            BTW rwd is much slower for writes than rw, and rws is slower again.
         */

        RandomAccessFile raf = new RandomAccessFile(new File("1.bin"), "r");
        long position = raf.getFilePointer();
        raf.seek(position);

        // Objects
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file"));
        oos.writeObject(new String(""));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file"));
        Object o = ois.readObject();

        // magic with bytes.
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(55);
        baos.write(77);
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        int read = bais.read();
    }

    public static void main2(String[] args) {
        // paths
        Path absolute = Paths.get("/home", "alex");
        Path relative = Paths.get("dev", "student","dima");
        relative.toAbsolutePath();
        File file = relative.toFile();
    }

    public static void main3(String[] args) throws IOException {
        InputStream is = Files.newInputStream(Paths.get("1.txt"));
        BufferedReader br = Files.newBufferedReader(Paths.get("1.txt"));
        OutputStream os = Files.newOutputStream(Paths.get("1.txt"));
        BufferedWriter bw = Files.newBufferedWriter(Paths.get("1.txt"));
    }

    public static void main4(String[] args) throws IOException {
        File f = new File("1.txt");
        boolean deleted = f.delete();

        File f2 = new File("1.txt");
        boolean successful = f2.createNewFile();

        Files.delete(Paths.get("1.txt"));
        Files.deleteIfExists(Paths.get("1.txt"));

        Path f3 = Files.createFile(Paths.get("1.txt"));
        Path f4 = Files.createTempFile("aa", "bb");
    }

    public static void main5(String[] args) throws IOException {
        Path dir1 = Files.createDirectory(Paths.get("aa"));
        Path dir2 = Files.createTempDirectory(Paths.get("aa"), "_tt");
    }

    public static void main6(String[] args) throws IOException {
        Path src = Paths.get("from.txt");
        Path dst = Paths.get("to.txt");
        FileInputStream in = new FileInputStream("from.txt");
        FileOutputStream os = new FileOutputStream("to.txt");

        Files.copy(src, dst);
        Files.copy(in, dst);
        Files.copy(src, os);

        Files.move(src, dst);
    }

    public static void main7(String[] args) throws IOException {
        DirectoryStream<Path> dirs0 = Files.newDirectoryStream(Paths.get(""));
        dirs0.forEach(System.out::println);
        System.out.println("-----");
        DirectoryStream<Path> dirs1 = Files.newDirectoryStream(Paths.get("."));
        dirs1.forEach(System.out::println);
        System.out.println("-----");
        DirectoryStream<Path> dirs2 = Files.newDirectoryStream(Paths.get("").toAbsolutePath(), "*");
        dirs2.forEach(System.out::println);
    }

    public static void main8(String[] args) throws IOException {
        // filter with specific
        Stream<Path> walk = Files.walk(Paths.get(""));
        walk.forEach(new Consumer<Path>() {
            @Override
            public void accept(Path path) {

            }
        });
    }

    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("src/main/java/iter/"), new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println(file);
                return FileVisitResult.CONTINUE;
            }
        });
    }

}
