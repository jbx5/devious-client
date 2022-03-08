import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("aa")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener , MouseMotionListener , FocusListener {
    @ObfuscatedName("sq")
    @ObfuscatedSignature(descriptor = "Lag;")
    @Export("pcmPlayer1")
    static PcmPlayer pcmPlayer1;

    @ObfuscatedName("ux")
    @ObfuscatedSignature(descriptor = "Lom;")
    @Export("platformInfo")
    static PlatformInfo platformInfo;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Laa;")
    @Export("MouseHandler_instance")
    public static MouseHandler MouseHandler_instance;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = 1073893907)
    @Export("MouseHandler_idleCycles")
    static volatile int MouseHandler_idleCycles;

    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = -1694985193)
    @Export("MouseHandler_currentButtonVolatile")
    static volatile int MouseHandler_currentButtonVolatile;

    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = -830820655)
    @Export("MouseHandler_xVolatile")
    static volatile int MouseHandler_xVolatile;

    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 668120751)
    @Export("MouseHandler_yVolatile")
    static volatile int MouseHandler_yVolatile;

    @ObfuscatedName("v")
    @ObfuscatedGetter(longValue = -3728044565388520941L)
    @Export("MouseHandler_lastMovedVolatile")
    static volatile long MouseHandler_lastMovedVolatile;

    @ObfuscatedName("a")
    @ObfuscatedGetter(intValue = 1322576095)
    @Export("MouseHandler_currentButton")
    public static int MouseHandler_currentButton;

    @ObfuscatedName("y")
    @ObfuscatedGetter(longValue = 3778330924173868733L)
    @Export("MouseHandler_millis")
    public static long MouseHandler_millis;

    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 977348605)
    @Export("MouseHandler_x")
    public static int MouseHandler_x;

    @ObfuscatedName("h")
    @ObfuscatedGetter(intValue = 674458539)
    @Export("MouseHandler_y")
    public static int MouseHandler_y;

    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = -18952791)
    @Export("MouseHandler_lastButtonVolatile")
    static volatile int MouseHandler_lastButtonVolatile;

    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = -158816913)
    @Export("MouseHandler_lastPressedXVolatile")
    static volatile int MouseHandler_lastPressedXVolatile;

    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = -1161470035)
    @Export("MouseHandler_lastPressedYVolatile")
    static volatile int MouseHandler_lastPressedYVolatile;

    @ObfuscatedName("n")
    @ObfuscatedGetter(longValue = -2923617770856931813L)
    @Export("MouseHandler_lastPressedTimeMillisVolatile")
    static volatile long MouseHandler_lastPressedTimeMillisVolatile;

    @ObfuscatedName("m")
    @ObfuscatedGetter(intValue = -907131657)
    @Export("MouseHandler_lastButton")
    public static int MouseHandler_lastButton;

    @ObfuscatedName("d")
    @ObfuscatedGetter(intValue = -1454234719)
    @Export("MouseHandler_lastPressedX")
    public static int MouseHandler_lastPressedX;

    @ObfuscatedName("j")
    @ObfuscatedGetter(intValue = 771902181)
    @Export("MouseHandler_lastPressedY")
    public static int MouseHandler_lastPressedY;

    @ObfuscatedName("f")
    @ObfuscatedGetter(longValue = 2709122788855989661L)
    @Export("MouseHandler_lastPressedTimeMillis")
    public static long MouseHandler_lastPressedTimeMillis;

    @ObfuscatedName("hq")
    @ObfuscatedGetter(intValue = 700693617)
    static int field240;

    static {
        MouseHandler_instance = new MouseHandler();
        MouseHandler_idleCycles = 0;
        MouseHandler_currentButtonVolatile = 0;
        MouseHandler_xVolatile = -1;
        MouseHandler_yVolatile = -1;
        MouseHandler_lastMovedVolatile = -1L;
        MouseHandler_currentButton = 0;
        MouseHandler_x = 0;
        MouseHandler_y = 0;
        MouseHandler_millis = 0L;
        MouseHandler_lastButtonVolatile = 0;
        MouseHandler_lastPressedXVolatile = 0;
        MouseHandler_lastPressedYVolatile = 0;
        MouseHandler_lastPressedTimeMillisVolatile = 0L;
        MouseHandler_lastButton = 0;
        MouseHandler_lastPressedX = 0;
        MouseHandler_lastPressedY = 0;
        MouseHandler_lastPressedTimeMillis = 0L;
    }

    MouseHandler() {
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(Ljava/awt/event/MouseEvent;I)I", garbageValue = "992968755")
    @Export("getButton")
    final int getButton(MouseEvent var1) {
        int var2 = var1.getButton();
        if ((!var1.isAltDown()) && (var2 != 2)) {
            return (!var1.isMetaDown()) && (var2 != 3) ? 1 : 2;
        } else {
            return 4;
        }
    }

    public synchronized final void mouseMoved(MouseEvent var1) {
        if (MouseHandler_instance != null) {
            MouseHandler_idleCycles = 0;
            MouseHandler_xVolatile = var1.getX();
            MouseHandler_yVolatile = var1.getY();
            MouseHandler_lastMovedVolatile = var1.getWhen();
        }
    }

    public synchronized final void mouseEntered(MouseEvent var1) {
        this.mouseMoved(var1);
    }

    public synchronized final void mousePressed(MouseEvent var1) {
        if (MouseHandler_instance != null) {
            MouseHandler_idleCycles = 0;
            MouseHandler_lastPressedXVolatile = var1.getX();
            MouseHandler_lastPressedYVolatile = var1.getY();
            MouseHandler_lastPressedTimeMillisVolatile = DirectByteArrayCopier.getServerTime();
            MouseHandler_lastButtonVolatile = this.getButton(var1);
            if (MouseHandler_lastButtonVolatile != 0) {
                MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
            }
        }
        if (var1.isPopupTrigger()) {
            var1.consume();
        }
    }

    public synchronized final void mouseReleased(MouseEvent var1) {
        if (MouseHandler_instance != null) {
            MouseHandler_idleCycles = 0;
            MouseHandler_currentButtonVolatile = 0;
        }
        if (var1.isPopupTrigger()) {
            var1.consume();
        }
    }

    public synchronized final void mouseExited(MouseEvent var1) {
        if (MouseHandler_instance != null) {
            MouseHandler_idleCycles = 0;
            MouseHandler_xVolatile = -1;
            MouseHandler_yVolatile = -1;
            MouseHandler_lastMovedVolatile = var1.getWhen();
        }
    }

    public synchronized final void mouseDragged(MouseEvent var1) {
        this.mouseMoved(var1);
    }

    public final void focusGained(FocusEvent var1) {
    }

    public synchronized final void focusLost(FocusEvent var1) {
        if (MouseHandler_instance != null) {
            MouseHandler_currentButtonVolatile = 0;
        }
    }

    public final void mouseClicked(MouseEvent var1) {
        if (var1.isPopupTrigger()) {
            var1.consume();
        }
    }

    @ObfuscatedName("q")
    @ObfuscatedSignature(descriptor = "(II)Lgu;", garbageValue = "-1943913678")
    @Export("getFrames")
    static Frames getFrames(int var0) {
        Frames var1 = ((Frames) (SequenceDefinition.SequenceDefinition_cachedFrames.get(((long) (var0)))));
        if (var1 != null) {
            return var1;
        } else {
            AbstractArchive var3 = WorldMapData_0.SequenceDefinition_animationsArchive;
            AbstractArchive var4 = SequenceDefinition.SequenceDefinition_skeletonsArchive;
            boolean var5 = true;
            int[] var6 = var3.getGroupFileIds(var0);
            for (int var7 = 0; var7 < var6.length; ++var7) {
                byte[] var8 = var3.getFile(var0, var6[var7]);
                if (var8 == null) {
                    var5 = false;
                } else {
                    int var9 = ((var8[0] & 255) << 8) | (var8[1] & 255);
                    byte[] var10 = var4.getFile(var9, 0);
                    if (var10 == null) {
                        var5 = false;
                    }
                }
            }
            Frames var2;
            if (!var5) {
                var2 = null;
            } else {
                try {
                    var2 = new Frames(var3, var4, var0, false);
                } catch (Exception var12) {
                    var2 = null;
                }
            }
            if (var2 != null) {
                SequenceDefinition.SequenceDefinition_cachedFrames.put(var2, ((long) (var0)));
            }
            return var2;
        }
    }

    @ObfuscatedName("hm")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-753950525")
    static final void method615() {
        HorizontalAlignment.method3279(false);
        Client.field498 = 0;
        boolean var0 = true;
        int var1;
        for (var1 = 0; var1 < Friend.regionLandArchives.length; ++var1) {
            if ((Varcs.regionMapArchiveIds[var1] != (-1)) && (Friend.regionLandArchives[var1] == null)) {
                Friend.regionLandArchives[var1] = Client.archive5.takeFile(Varcs.regionMapArchiveIds[var1], 0);
                if (Friend.regionLandArchives[var1] == null) {
                    var0 = false;
                    ++Client.field498;
                }
            }
            if ((WorldMapData_0.regionLandArchiveIds[var1] != (-1)) && (ReflectionCheck.regionMapArchives[var1] == null)) {
                ReflectionCheck.regionMapArchives[var1] = Client.archive5.takeFileEncrypted(WorldMapData_0.regionLandArchiveIds[var1], 0, UserComparator8.xteaKeys[var1]);
                if (ReflectionCheck.regionMapArchives[var1] == null) {
                    var0 = false;
                    ++Client.field498;
                }
            }
        }
        if (!var0) {
            Client.field621 = 1;
        } else {
            Client.field559 = 0;
            var0 = true;
            int var3;
            int var4;
            for (var1 = 0; var1 < Friend.regionLandArchives.length; ++var1) {
                byte[] var15 = ReflectionCheck.regionMapArchives[var1];
                if (var15 != null) {
                    var3 = ((WorldMapLabel.regions[var1] >> 8) * 64) - Canvas.baseX;
                    var4 = ((WorldMapLabel.regions[var1] & 255) * 64) - class118.baseY;
                    if (Client.isInInstance) {
                        var3 = 10;
                        var4 = 10;
                    }
                    var0 &= FriendSystem.method1689(var15, var3, var4);
                }
            }
            if (!var0) {
                Client.field621 = 2;
            } else {
                if (Client.field621 != 0) {
                    Calendar.drawLoadingMessage(((("Loading - please wait." + ("<br>" + " (")) + 100) + "%") + ")", true);
                }
                class122.playPcmPlayers();
                Decimator.scene.clear();
                for (var1 = 0; var1 < 4; ++var1) {
                    Client.collisionMaps[var1].clear();
                }
                int var2;
                for (var1 = 0; var1 < 4; ++var1) {
                    for (var2 = 0; var2 < 104; ++var2) {
                        for (var3 = 0; var3 < 104; ++var3) {
                            Tiles.Tiles_renderFlags[var1][var2][var3] = 0;
                        }
                    }
                }
                class122.playPcmPlayers();
                UserComparator5.method2475();
                var1 = Friend.regionLandArchives.length;
                SequenceDefinition.method3623();
                HorizontalAlignment.method3279(true);
                int var5;
                if (!Client.isInInstance) {
                    byte[] var14;
                    for (var2 = 0; var2 < var1; ++var2) {
                        var3 = ((WorldMapLabel.regions[var2] >> 8) * 64) - Canvas.baseX;
                        var4 = ((WorldMapLabel.regions[var2] & 255) * 64) - class118.baseY;
                        var14 = Friend.regionLandArchives[var2];
                        if (var14 != null) {
                            class122.playPcmPlayers();
                            Varps.method5333(var14, var3, var4, (field240 * 8) - 48, (UserComparator7.field1352 * 8) - 48, Client.collisionMaps);
                        }
                    }
                    for (var2 = 0; var2 < var1; ++var2) {
                        var3 = ((WorldMapLabel.regions[var2] >> 8) * 64) - Canvas.baseX;
                        var4 = ((WorldMapLabel.regions[var2] & 255) * 64) - class118.baseY;
                        var14 = Friend.regionLandArchives[var2];
                        if ((var14 == null) && (UserComparator7.field1352 < 800)) {
                            class122.playPcmPlayers();
                            class7.method51(var3, var4, 64, 64);
                        }
                    }
                    HorizontalAlignment.method3279(true);
                    for (var2 = 0; var2 < var1; ++var2) {
                        byte[] var13 = ReflectionCheck.regionMapArchives[var2];
                        if (var13 != null) {
                            var4 = ((WorldMapLabel.regions[var2] >> 8) * 64) - Canvas.baseX;
                            var5 = ((WorldMapLabel.regions[var2] & 255) * 64) - class118.baseY;
                            class122.playPcmPlayers();
                            class78.method2083(var13, var4, var5, Decimator.scene, Client.collisionMaps);
                        }
                    }
                }
                int var6;
                int var7;
                int var8;
                if (Client.isInInstance) {
                    int var9;
                    int var10;
                    int var11;
                    for (var2 = 0; var2 < 4; ++var2) {
                        class122.playPcmPlayers();
                        for (var3 = 0; var3 < 13; ++var3) {
                            for (var4 = 0; var4 < 13; ++var4) {
                                boolean var16 = false;
                                var6 = Client.instanceChunkTemplates[var2][var3][var4];
                                if (var6 != (-1)) {
                                    var7 = (var6 >> 24) & 3;
                                    var8 = (var6 >> 1) & 3;
                                    var9 = (var6 >> 14) & 1023;
                                    var10 = (var6 >> 3) & 2047;
                                    var11 = ((var9 / 8) << 8) + (var10 / 8);
                                    for (int var12 = 0; var12 < WorldMapLabel.regions.length; ++var12) {
                                        if ((WorldMapLabel.regions[var12] == var11) && (Friend.regionLandArchives[var12] != null)) {
                                            ViewportMouse.method4264(Friend.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, Client.collisionMaps);
                                            var16 = true;
                                            break;
                                        }
                                    }
                                }
                                if (!var16) {
                                    Canvas.method370(var2, var3 * 8, var4 * 8);
                                }
                            }
                        }
                    }
                    for (var2 = 0; var2 < 13; ++var2) {
                        for (var3 = 0; var3 < 13; ++var3) {
                            var4 = Client.instanceChunkTemplates[0][var2][var3];
                            if (var4 == (-1)) {
                                class7.method51(var2 * 8, var3 * 8, 8, 8);
                            }
                        }
                    }
                    HorizontalAlignment.method3279(true);
                    for (var2 = 0; var2 < 4; ++var2) {
                        class122.playPcmPlayers();
                        for (var3 = 0; var3 < 13; ++var3) {
                            for (var4 = 0; var4 < 13; ++var4) {
                                var5 = Client.instanceChunkTemplates[var2][var3][var4];
                                if (var5 != (-1)) {
                                    var6 = (var5 >> 24) & 3;
                                    var7 = (var5 >> 1) & 3;
                                    var8 = (var5 >> 14) & 1023;
                                    var9 = (var5 >> 3) & 2047;
                                    var10 = ((var8 / 8) << 8) + (var9 / 8);
                                    for (var11 = 0; var11 < WorldMapLabel.regions.length; ++var11) {
                                        if ((WorldMapLabel.regions[var11] == var10) && (ReflectionCheck.regionMapArchives[var11] != null)) {
                                            Tiles.method2031(ReflectionCheck.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, Decimator.scene, Client.collisionMaps);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                HorizontalAlignment.method3279(true);
                class122.playPcmPlayers();
                class145.method2976(Decimator.scene, Client.collisionMaps);
                HorizontalAlignment.method3279(true);
                var2 = Tiles.Tiles_minPlane;
                if (var2 > SoundSystem.Client_plane) {
                    var2 = SoundSystem.Client_plane;
                }
                if (var2 < (SoundSystem.Client_plane - 1)) {
                    var2 = SoundSystem.Client_plane - 1;
                }
                if (Client.isLowDetail) {
                    Decimator.scene.init(Tiles.Tiles_minPlane);
                } else {
                    Decimator.scene.init(0);
                }
                for (var3 = 0; var3 < 104; ++var3) {
                    for (var4 = 0; var4 < 104; ++var4) {
                        StudioGame.updateItemPile(var3, var4);
                    }
                }
                class122.playPcmPlayers();
                class87.method2220();
                ObjectComposition.ObjectDefinition_cachedModelData.clear();
                PacketBufferNode var17;
                if (class414.client.hasFrame()) {
                    var17 = class135.getPacketBufferNode(ClientPacket.field2897, Client.packetWriter.isaacCipher);
                    var17.packetBuffer.writeInt(1057001181);
                    Client.packetWriter.addNode(var17);
                }
                if (!Client.isInInstance) {
                    var3 = (field240 - 6) / 8;
                    var4 = (field240 + 6) / 8;
                    var5 = (UserComparator7.field1352 - 6) / 8;
                    var6 = (UserComparator7.field1352 + 6) / 8;
                    for (var7 = var3 - 1; var7 <= (var4 + 1); ++var7) {
                        for (var8 = var5 - 1; var8 <= (var6 + 1); ++var8) {
                            if ((((var7 < var3) || (var7 > var4)) || (var8 < var5)) || (var8 > var6)) {
                                Client.archive5.loadRegionFromName((("m" + var7) + "_") + var8);
                                Client.archive5.loadRegionFromName((("l" + var7) + "_") + var8);
                            }
                        }
                    }
                }
                class111.updateGameState(30);
                class122.playPcmPlayers();
                class111.method2525();
                var17 = class135.getPacketBufferNode(ClientPacket.field2883, Client.packetWriter.isaacCipher);
                Client.packetWriter.addNode(var17);
                GrandExchangeOfferOwnWorldComparator.method1121();
            }
        }
    }

    @ObfuscatedName("kb")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1548132966")
    @Export("updateSoundEffectVolume")
    static final void updateSoundEffectVolume(int var0) {
        var0 = Math.min(Math.max(var0, 0), 127);
        class424.clientPreferences.soundEffectsVolume = var0;
        GameEngine.savePreferences();
    }
}