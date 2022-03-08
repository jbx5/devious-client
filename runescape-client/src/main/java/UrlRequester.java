import java.applet.Applet;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import netscape.javascript.JSObject;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("cz")
@Implements("UrlRequester")
public class UrlRequester implements Runnable {
    @ObfuscatedName("c")
    @Export("thread")
    final Thread thread;

    @ObfuscatedName("l")
    @Export("isClosed")
    volatile boolean isClosed;

    @ObfuscatedName("s")
    @Export("requests")
    Queue requests;

    public UrlRequester() {
        this.requests = new LinkedList();
        this.thread = new Thread(this);
        this.thread.setPriority(1);
        this.thread.start();
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Ljava/net/URL;I)Lcm;", garbageValue = "-558103760")
    @Export("request")
    public UrlRequest request(URL var1) {
        UrlRequest var2 = new UrlRequest(var1);
        synchronized(this) {
            this.requests.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-124")
    @Export("close")
    public void close() {
        this.isClosed = true;
        try {
            synchronized(this) {
                this.notify();
            }
            this.thread.join();
        } catch (InterruptedException var4) {
        }
    }

    public void run() {
        while (!this.isClosed) {
            try {
                UrlRequest var1;
                synchronized(this) {
                    var1 = ((UrlRequest) (this.requests.poll()));
                    if (var1 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var13) {
                        }
                        continue;
                    }
                }
                DataInputStream var2 = null;
                URLConnection var3 = null;
                try {
                    var3 = var1.url.openConnection();
                    var3.setConnectTimeout(5000);
                    var3.setReadTimeout(5000);
                    var3.setUseCaches(false);
                    var3.setRequestProperty("Connection", "close");
                    int var7 = var3.getContentLength();
                    if (var7 >= 0) {
                        byte[] var5 = new byte[var7];
                        var2 = new DataInputStream(var3.getInputStream());
                        var2.readFully(var5);
                        var1.response0 = var5;
                    }
                    var1.isDone0 = true;
                } catch (IOException var14) {
                    var1.isDone0 = true;
                } finally {
                    if (var2 != null) {
                        var2.close();
                    }
                    if ((var3 != null) && (var3 instanceof HttpURLConnection)) {
                        ((HttpURLConnection) (var3)).disconnect();
                    }
                }
            } catch (Exception var17) {
                FloorDecoration.RunException_sendStackTrace(((String) (null)), var17);
            }
        } 
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "([BILjava/lang/CharSequence;I)I", garbageValue = "-29911257")
    public static int method2420(byte[] var0, int var1, CharSequence var2) {
        int var3 = var2.length();
        int var4 = var1;
        for (int var5 = 0; var5 < var3; ++var5) {
            char var6 = var2.charAt(var5);
            if (var6 <= 127) {
                var0[var4++] = ((byte) (var6));
            } else if (var6 <= 2047) {
                var0[var4++] = ((byte) (192 | (var6 >> 6)));
                var0[var4++] = ((byte) (128 | (var6 & '?')));
            } else {
                var0[var4++] = ((byte) (224 | (var6 >> '\f')));
                var0[var4++] = ((byte) (128 | ((var6 >> 6) & 63)));
                var0[var4++] = ((byte) (128 | (var6 & '?')));
            }
        }
        return var4 - var1;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[IIII)V", garbageValue = "448998366")
    public static void method2421(String[] var0, int[] var1, int var2, int var3) {
        if (var2 < var3) {
            int var4 = (var3 + var2) / 2;
            int var5 = var2;
            String var6 = var0[var4];
            var0[var4] = var0[var3];
            var0[var3] = var6;
            int var7 = var1[var4];
            var1[var4] = var1[var3];
            var1[var3] = var7;
            for (int var8 = var2; var8 < var3; ++var8) {
                if ((var6 == null) || ((var0[var8] != null) && (var0[var8].compareTo(var6) < (var8 & 1)))) {
                    String var9 = var0[var8];
                    var0[var8] = var0[var5];
                    var0[var5] = var9;
                    int var10 = var1[var8];
                    var1[var8] = var1[var5];
                    var1[var5++] = var10;
                }
            }
            var0[var3] = var0[var5];
            var0[var5] = var6;
            var1[var3] = var1[var5];
            var1[var5] = var7;
            method2421(var0, var1, var2, var5 - 1);
            method2421(var0, var1, var5 + 1, var3);
        }
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;ILjava/lang/String;B)Z", garbageValue = "72")
    static boolean method2419(String var0, int var1, String var2) {
        if (var1 == 0) {
            try {
                if (!class29.field175.startsWith("win")) {
                    throw new Exception();
                } else if ((!var0.startsWith("http://")) && (!var0.startsWith("https://"))) {
                    throw new Exception();
                } else {
                    String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                    for (int var4 = 0; var4 < var0.length(); ++var4) {
                        if (var11.indexOf(var0.charAt(var4)) == (-1)) {
                            throw new Exception();
                        }
                    }
                    Runtime.getRuntime().exec(("cmd /c start \"j\" \"" + var0) + "\"");
                    return true;
                }
            } catch (Throwable var5) {
                return false;
            }
        } else if (var1 == 1) {
            try {
                Object var10 = class27.method396(class29.field177, var2, new Object[]{ new URL(class29.field177.getCodeBase(), var0).toString() });
                return var10 != null;
            } catch (Throwable var6) {
                return false;
            }
        } else if (var1 == 2) {
            try {
                class29.field177.getAppletContext().showDocument(new URL(class29.field177.getCodeBase(), var0), "_blank");
                return true;
            } catch (Exception var7) {
                return false;
            }
        } else if (var1 == 3) {
            try {
                Applet var3 = class29.field177;
                JSObject.getWindow(var3).call("loggedout", ((Object[]) (null)));
            } catch (Throwable var9) {
            }
            try {
                class29.field177.getAppletContext().showDocument(new URL(class29.field177.getCodeBase(), var0), "_top");
                return true;
            } catch (Exception var8) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(I)[Ldi;", garbageValue = "-862864907")
    static class114[] method2418() {
        return new class114[]{ class114.field1408, class114.field1409, class114.field1410, class114.field1413, class114.field1412 };
    }
}