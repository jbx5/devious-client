import java.io.File;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("mi")
@Implements("FriendsList")
public class FriendsList extends UserList {
    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Lok;")
    @Export("loginType")
    final LoginType loginType;

    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = 759780713)
    int field4127;

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "Llp;")
    @Export("friendLoginUpdates")
    public LinkDeque friendLoginUpdates;

    @ObfuscatedSignature(descriptor = "(Lok;)V")
    public FriendsList(LoginType var1) {
        super(400);
        this.field4127 = 1;
        this.friendLoginUpdates = new LinkDeque();
        this.loginType = var1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)Lmy;", garbageValue = "2000225121")
    @Export("newInstance")
    User newInstance() {
        return new Friend();
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(IB)[Lmy;", garbageValue = "55")
    @Export("newTypedArray")
    User[] newTypedArray(int var1) {
        return new Friend[var1];
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Lpb;ZI)Z", garbageValue = "-770793649")
    @Export("isFriended")
    public boolean isFriended(Username var1, boolean var2) {
        Friend var3 = ((Friend) (this.getByUsername(var1)));
        if (var3 == null) {
            return false;
        } else {
            return (!var2) || (var3.world != 0);
        }
    }

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "(Lpi;IB)V", garbageValue = "8")
    @Export("read")
    public void read(Buffer var1, int var2) {
        while (true) {
            if (var1.offset < var2) {
                boolean var3 = var1.readUnsignedByte() == 1;
                Username var4 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
                Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
                int var6 = var1.readUnsignedShort();
                int var7 = var1.readUnsignedByte();
                int var8 = var1.readUnsignedByte();
                boolean var9 = (var8 & 2) != 0;
                boolean var10 = (var8 & 1) != 0;
                if (var6 > 0) {
                    var1.readStringCp1252NullTerminated();
                    var1.readUnsignedByte();
                    var1.readInt();
                }
                var1.readStringCp1252NullTerminated();
                if ((var4 != null) && var4.hasCleanName()) {
                    Friend var11 = ((Friend) (this.getByCurrentUsername(var4)));
                    if (var3) {
                        Friend var12 = ((Friend) (this.getByCurrentUsername(var5)));
                        if ((var12 != null) && (var11 != var12)) {
                            if (var11 != null) {
                                this.remove(var12);
                            } else {
                                var11 = var12;
                            }
                        }
                    }
                    if (var11 != null) {
                        this.changeName(var11, var4, var5);
                        if (var6 != var11.world) {
                            boolean var14 = true;
                            for (FriendLoginUpdate var13 = ((FriendLoginUpdate) (this.friendLoginUpdates.last())); var13 != null; var13 = ((FriendLoginUpdate) (this.friendLoginUpdates.previous()))) {
                                if (var13.username.equals(var4)) {
                                    if ((var6 != 0) && (var13.world == 0)) {
                                        var13.remove();
                                        var14 = false;
                                    } else if ((var6 == 0) && (var13.world != 0)) {
                                        var13.remove();
                                        var14 = false;
                                    }
                                }
                            }
                            if (var14) {
                                this.friendLoginUpdates.addFirst(new FriendLoginUpdate(var4, var6));
                            }
                        }
                    } else {
                        if (this.getSize() >= 400) {
                            continue;
                        }
                        var11 = ((Friend) (this.addLast(var4, var5)));
                    }
                    if (var6 != var11.world) {
                        var11.int2 = (++this.field4127) - 1;
                        if ((var11.world == (-1)) && (var6 == 0)) {
                            var11.int2 = (-(var11.int2 * 650111289)) * 2142778633;
                        }
                        var11.world = var6;
                    }
                    var11.rank = var7;
                    var11.field4133 = var9;
                    var11.field4134 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.sort();
            return;
        } 
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Ljava/io/File;I)V", garbageValue = "-428175274")
    static void method6282(File var0) {
        SecureRandomCallable.FileSystem_cacheDir = var0;
        if (!SecureRandomCallable.FileSystem_cacheDir.exists()) {
            throw new RuntimeException("");
        } else {
            FileSystem.FileSystem_hasPermissions = true;
        }
    }

    @ObfuscatedName("j")
    @ObfuscatedSignature(descriptor = "(ILbl;ZI)I", garbageValue = "-490218334")
    static int method6283(int var0, Script var1, boolean var2) {
        Widget var5;
        if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
            var5 = class130.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var5.itemId;
            return 1;
        } else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
            var5 = class130.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
            if (var5.itemId != (-1)) {
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var5.itemQuantity;
            } else {
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
            }
            return 1;
        } else if (var0 == ScriptOpcodes.IF_HASSUB) {
            int var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            InterfaceParent var4 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var3)))));
            if (var4 != null) {
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 1;
            } else {
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
            }
            return 1;
        } else if (var0 == ScriptOpcodes.IF_GETTOP) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.rootInterface;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("g")
    @ObfuscatedSignature(descriptor = "(IZIB)V", garbageValue = "-56")
    public static final void method6281(int var0, boolean var1, int var2) {
        if ((var0 >= 8000) && (var0 <= 48000)) {
            PcmPlayer.field305 = var0;
            PcmPlayer.PcmPlayer_stereo = var1;
            DevicePcmPlayerProvider.field156 = var2;
        } else {
            throw new IllegalArgumentException();
        }
    }
}