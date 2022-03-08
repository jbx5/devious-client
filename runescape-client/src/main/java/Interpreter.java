import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("bs")
@Implements("Interpreter")
public class Interpreter {
    @ObfuscatedName("to")
    @ObfuscatedGetter(intValue = 1620756847)
    static int field854;

    @ObfuscatedName("o")
    @Export("Interpreter_intLocals")
    static int[] Interpreter_intLocals;

    @ObfuscatedName("i")
    @Export("Interpreter_stringLocals")
    static String[] Interpreter_stringLocals;

    @ObfuscatedName("w")
    @Export("Interpreter_arrayLengths")
    static int[] Interpreter_arrayLengths;

    @ObfuscatedName("v")
    @Export("Interpreter_arrays")
    static int[][] Interpreter_arrays;

    @ObfuscatedName("a")
    @Export("Interpreter_intStack")
    static int[] Interpreter_intStack;

    @ObfuscatedName("y")
    @ObfuscatedGetter(intValue = -1726545229)
    @Export("Interpreter_intStackSize")
    static int Interpreter_intStackSize;

    @ObfuscatedName("u")
    @Export("Interpreter_stringStack")
    static String[] Interpreter_stringStack;

    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = -2049233165)
    @Export("Interpreter_frameDepth")
    static int Interpreter_frameDepth;

    @ObfuscatedName("x")
    @ObfuscatedSignature(descriptor = "[Lbx;")
    @Export("Interpreter_frames")
    static ScriptFrame[] Interpreter_frames;

    @ObfuscatedName("p")
    @ObfuscatedSignature(descriptor = "Ljz;")
    @Export("scriptActiveWidget")
    static Widget scriptActiveWidget;

    @ObfuscatedName("f")
    @Export("Interpreter_calendar")
    static java.util.Calendar Interpreter_calendar;

    @ObfuscatedName("g")
    @Export("Interpreter_MONTHS")
    static final String[] Interpreter_MONTHS;

    @ObfuscatedName("k")
    static boolean field846;

    @ObfuscatedName("b")
    static boolean field848;

    @ObfuscatedName("z")
    static ArrayList field832;

    @ObfuscatedName("ap")
    @ObfuscatedGetter(intValue = -1404435583)
    static int field849;

    @ObfuscatedName("ar")
    static final double field850;

    static {
        Interpreter_arrayLengths = new int[5];
        Interpreter_arrays = new int[5][5000];
        Interpreter_intStack = new int[1000];
        Interpreter_stringStack = new String[1000];
        Interpreter_frameDepth = 0;
        Interpreter_frames = new ScriptFrame[50];
        Interpreter_calendar = java.util.Calendar.getInstance();
        Interpreter_MONTHS = new String[]{ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        field846 = false;
        field848 = false;
        field832 = new ArrayList();
        field849 = 0;
        field850 = Math.log(2.0);
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;IIB)V", garbageValue = "62")
    public static void method1876(String var0, String var1, int var2, int var3) throws IOException {
        JagexCache.idxCount = var3;
        WorldMapSectionType.cacheGamebuild = var2;
        try {
            Messages.operatingSystemName = System.getProperty("os.name");
        } catch (Exception var34) {
            Messages.operatingSystemName = "Unknown";
        }
        ArchiveLoader.formattedOperatingSystemName = Messages.operatingSystemName.toLowerCase();
        try {
            TileItem.userHomeDirectory = System.getProperty("user.home");
            if (TileItem.userHomeDirectory != null) {
                TileItem.userHomeDirectory = TileItem.userHomeDirectory + "/";
            }
        } catch (Exception var33) {
        }
        try {
            if (ArchiveLoader.formattedOperatingSystemName.startsWith("win")) {
                if (TileItem.userHomeDirectory == null) {
                    TileItem.userHomeDirectory = System.getenv("USERPROFILE");
                }
            } else if (TileItem.userHomeDirectory == null) {
                TileItem.userHomeDirectory = System.getenv("HOME");
            }
            if (TileItem.userHomeDirectory != null) {
                TileItem.userHomeDirectory = TileItem.userHomeDirectory + "/";
            }
        } catch (Exception var32) {
        }
        if (TileItem.userHomeDirectory == null) {
            TileItem.userHomeDirectory = "~/";
        }
        class320.cacheParentPaths = new String[]{ "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", TileItem.userHomeDirectory, "/tmp/", "" };
        class121.cacheSubPaths = new String[]{ ".jagex_cache_" + WorldMapSectionType.cacheGamebuild, ".file_store_" + WorldMapSectionType.cacheGamebuild };
        int var18 = 0;
        label296 : while (var18 < 4) {
            String var6 = (var18 == 0) ? "" : "" + var18;
            JagexCache.JagexCache_locationFile = new File(TileItem.userHomeDirectory, (((("jagex_cl_" + var0) + "_") + var1) + var6) + ".dat");
            String var7 = null;
            String var8 = null;
            boolean var9 = false;
            int var12;
            int var14;
            File var41;
            if (JagexCache.JagexCache_locationFile.exists()) {
                try {
                    AccessFile var10 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);
                    Buffer var11;
                    for (var11 = new Buffer(((int) (var10.length()))); var11.offset < var11.array.length; var11.offset += var12) {
                        var12 = var10.read(var11.array, var11.offset, var11.array.length - var11.offset);
                        if (var12 == (-1)) {
                            throw new IOException();
                        }
                    }
                    var11.offset = 0;
                    var12 = var11.readUnsignedByte();
                    if ((var12 < 1) || (var12 > 3)) {
                        throw new IOException("" + var12);
                    }
                    int var13 = 0;
                    if (var12 > 1) {
                        var13 = var11.readUnsignedByte();
                    }
                    if (var12 <= 2) {
                        var7 = var11.readStringCp1252NullCircumfixed();
                        if (var13 == 1) {
                            var8 = var11.readStringCp1252NullCircumfixed();
                        }
                    } else {
                        var7 = var11.readCESU8();
                        if (var13 == 1) {
                            var8 = var11.readCESU8();
                        }
                    }
                    var10.close();
                } catch (IOException var37) {
                    var37.printStackTrace();
                }
                if (var7 != null) {
                    var41 = new File(var7);
                    if (!var41.exists()) {
                        var7 = null;
                    }
                }
                if (var7 != null) {
                    var41 = new File(var7, "test.dat");
                    boolean var45;
                    try {
                        RandomAccessFile var19 = new RandomAccessFile(var41, "rw");
                        var14 = var19.read();
                        var19.seek(0L);
                        var19.write(var14);
                        var19.seek(0L);
                        var19.close();
                        var41.delete();
                        var45 = true;
                    } catch (Exception var31) {
                        var45 = false;
                    }
                    if (!var45) {
                        var7 = null;
                    }
                }
            }
            if ((var7 == null) && (var18 == 0)) {
                label271 : for (int var20 = 0; var20 < class121.cacheSubPaths.length; ++var20) {
                    for (int var21 = 0; var21 < class320.cacheParentPaths.length; ++var21) {
                        File var22 = new File((((class320.cacheParentPaths[var21] + class121.cacheSubPaths[var20]) + File.separatorChar) + var0) + File.separatorChar);
                        if (var22.exists()) {
                            File var23 = new File(var22, "test.dat");
                            boolean var46;
                            try {
                                RandomAccessFile var15 = new RandomAccessFile(var23, "rw");
                                int var16 = var15.read();
                                var15.seek(0L);
                                var15.write(var16);
                                var15.seek(0L);
                                var15.close();
                                var23.delete();
                                var46 = true;
                            } catch (Exception var30) {
                                var46 = false;
                            }
                            if (var46) {
                                var7 = var22.toString();
                                var9 = true;
                                break label271;
                            }
                        }
                    }
                }
            }
            if (var7 == null) {
                var7 = (((((((TileItem.userHomeDirectory + File.separatorChar) + "jagexcache") + var6) + File.separatorChar) + var0) + File.separatorChar) + var1) + File.separatorChar;
                var9 = true;
            }
            if (var8 != null) {
                File var40 = new File(var8);
                var41 = new File(var7);
                try {
                    File[] var50 = var40.listFiles();
                    File[] var48 = var50;
                    for (var14 = 0; var14 < var48.length; ++var14) {
                        File var47 = var48[var14];
                        File var24 = new File(var41, var47.getName());
                        boolean var17 = var47.renameTo(var24);
                        if (!var17) {
                            throw new IOException();
                        }
                    }
                } catch (Exception var36) {
                    var36.printStackTrace();
                }
                var9 = true;
            }
            if (var9) {
                BoundaryObject.method4277(new File(var7), ((File) (null)));
            }
            File var5 = new File(var7);
            UrlRequest.cacheDir = var5;
            if (!UrlRequest.cacheDir.exists()) {
                UrlRequest.cacheDir.mkdirs();
            }
            File[] var39 = UrlRequest.cacheDir.listFiles();
            if (var39 != null) {
                File[] var42 = var39;
                for (int var25 = 0; var25 < var42.length; ++var25) {
                    File var26 = var42[var25];
                    boolean var49;
                    try {
                        RandomAccessFile var44 = new RandomAccessFile(var26, "rw");
                        var12 = var44.read();
                        var44.seek(0L);
                        var44.write(var12);
                        var44.seek(0L);
                        var44.close();
                        var49 = true;
                    } catch (Exception var29) {
                        var49 = false;
                    }
                    if (!var49) {
                        ++var18;
                        continue label296;
                    }
                }
            }
            break;
        } 
        FriendsList.method6282(UrlRequest.cacheDir);
        try {
            File var4 = new File(TileItem.userHomeDirectory, "random.dat");
            int var28;
            if (var4.exists()) {
                JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var4, "rw", 25L), 24, 0);
            } else {
                label222 : for (int var27 = 0; var27 < class121.cacheSubPaths.length; ++var27) {
                    for (var28 = 0; var28 < class320.cacheParentPaths.length; ++var28) {
                        File var43 = new File(((class320.cacheParentPaths[var28] + class121.cacheSubPaths[var27]) + File.separatorChar) + "random.dat");
                        if (var43.exists()) {
                            JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var43, "rw", 25L), 24, 0);
                            break label222;
                        }
                    }
                }
            }
            if (JagexCache.JagexCache_randomDat == null) {
                RandomAccessFile var38 = new RandomAccessFile(var4, "rw");
                var28 = var38.read();
                var38.seek(0L);
                var38.write(var28);
                var38.seek(0L);
                var38.close();
                JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var4, "rw", 25L), 24, 0);
            }
        } catch (IOException var35) {
        }
        JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class374.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class374.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        VerticalAlignment.JagexCache_idxFiles = new BufferedFile[JagexCache.idxCount];
        for (var18 = 0; var18 < JagexCache.idxCount; ++var18) {
            VerticalAlignment.JagexCache_idxFiles[var18] = new BufferedFile(new AccessFile(class374.getFile("main_file_cache.idx" + var18), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(B)Lcl;", garbageValue = "53")
    static ClientPreferences method1877() {
        AccessFile var0 = null;
        ClientPreferences var1 = new ClientPreferences();
        try {
            var0 = VarbitComposition.getPreferencesFile("", HorizontalAlignment.field1846.name, false);
            byte[] var2 = new byte[((int) (var0.length()))];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.read(var2, var3, var2.length - var3);
                if (var4 == (-1)) {
                    throw new IOException();
                }
            }
            var1 = new ClientPreferences(new Buffer(var2));
        } catch (Exception var6) {
        }
        try {
            if (var0 != null) {
                var0.close();
            }
        } catch (Exception var5) {
        }
        return var1;
    }

    @ObfuscatedName("ih")
    @ObfuscatedSignature(descriptor = "(III)V", garbageValue = "570577906")
    static void method1875(int var0, int var1) {
        int var2 = class408.fontBold12.stringWidth("Choose Option");
        int var3;
        int var4;
        for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) {
            var4 = class408.fontBold12.stringWidth(class144.method2969(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        var3 = (Client.menuOptionsCount * 15) + 22;
        var4 = var0 - (var2 / 2);
        if ((var4 + var2) > DirectByteArrayCopier.canvasWidth) {
            var4 = DirectByteArrayCopier.canvasWidth - var2;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = var1;
        if ((var1 + var3) > NPC.canvasHeight) {
            var5 = NPC.canvasHeight - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        Projectile.menuX = var4;
        ReflectionCheck.menuY = var5;
        Calendar.menuWidth = var2;
        ScriptFrame.menuHeight = (Client.menuOptionsCount * 15) + 22;
    }

    @ObfuscatedName("jl")
    @ObfuscatedSignature(descriptor = "(IIIIII)V", garbageValue = "2054568175")
    @Export("drawScrollBar")
    static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
        class144.scrollBarSprites[0].drawAt(var0, var1);
        class144.scrollBarSprites[1].drawAt(var0, (var3 + var1) - 16);
        Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field720);
        int var5 = (var3 * (var3 - 32)) / var4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (((var3 - 32) - var5) * var2) / (var4 - var3);
        Rasterizer2D.Rasterizer2D_fillRectangle(var0, (var6 + var1) + 16, 16, var5, Client.field568);
        Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, (var6 + var1) + 16, var5, Client.field562);
        Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, (var6 + var1) + 16, var5, Client.field562);
        Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, (var6 + var1) + 16, 16, Client.field562);
        Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, (var6 + var1) + 17, 16, Client.field562);
        Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, (var6 + var1) + 16, var5, Client.field569);
        Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, (var6 + var1) + 17, var5 - 1, Client.field569);
        Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, ((var5 + var6) + var1) + 15, 16, Client.field569);
        Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, ((var5 + var6) + var1) + 14, 15, Client.field569);
    }

    @ObfuscatedName("ks")
    @ObfuscatedSignature(descriptor = "(IIIILpt;Ljq;I)V", garbageValue = "-344569961")
    @Export("drawSpriteOnMinimap")
    static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
        if (var4 != null) {
            int var6 = Client.camAngleY & 2047;
            int var7 = (var3 * var3) + (var2 * var2);
            if (var7 <= 6400) {
                int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
                int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
                int var10 = ((var9 * var2) + (var3 * var8)) >> 16;
                int var11 = ((var3 * var9) - (var8 * var2)) >> 16;
                if (var7 > 2500) {
                    var4.method7807((var10 + (var5.width / 2)) - (var4.width / 2), ((var5.height / 2) - var11) - (var4.height / 2), var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
                } else {
                    var4.drawTransBgAt(((var0 + var10) + (var5.width / 2)) - (var4.width / 2), (((var5.height / 2) + var1) - var11) - (var4.height / 2));
                }
            }
        }
    }
}