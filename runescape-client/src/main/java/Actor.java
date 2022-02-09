import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("cq")
@Implements("Actor")
public abstract class Actor extends Renderable {
    @ObfuscatedName("ar")
    @ObfuscatedGetter(intValue = 1377352685)
    @Export("x")
    int x;

    @ObfuscatedName("al")
    @ObfuscatedGetter(intValue = 1757184111)
    @Export("y")
    int y;

    @ObfuscatedName("aa")
    @ObfuscatedGetter(intValue = 86481407)
    @Export("rotation")
    int rotation;

    @ObfuscatedName("ao")
    @Export("isWalking")
    boolean isWalking;

    @ObfuscatedName("aq")
    @ObfuscatedGetter(intValue = 606159205)
    int field1113;

    @ObfuscatedName("ay")
    @ObfuscatedGetter(intValue = -1301285489)
    @Export("playerCycle")
    int playerCycle;

    @ObfuscatedName("ac")
    @ObfuscatedGetter(intValue = 930219719)
    @Export("idleSequence")
    int idleSequence;

    @ObfuscatedName("ab")
    @ObfuscatedGetter(intValue = -1164552409)
    @Export("turnLeftSequence")
    int turnLeftSequence;

    @ObfuscatedName("as")
    @ObfuscatedGetter(intValue = 1283066873)
    @Export("turnRightSequence")
    int turnRightSequence;

    @ObfuscatedName("ag")
    @ObfuscatedGetter(intValue = 1966550873)
    @Export("walkSequence")
    int walkSequence;

    @ObfuscatedName("az")
    @ObfuscatedGetter(intValue = -178450401)
    @Export("walkBackSequence")
    int walkBackSequence;

    @ObfuscatedName("ad")
    @ObfuscatedGetter(intValue = 206935327)
    @Export("walkLeftSequence")
    int walkLeftSequence;

    @ObfuscatedName("au")
    @ObfuscatedGetter(intValue = -988498907)
    @Export("walkRightSequence")
    int walkRightSequence;

    @ObfuscatedName("at")
    @ObfuscatedGetter(intValue = -248660997)
    @Export("runSequence")
    int runSequence;

    @ObfuscatedName("ae")
    @Export("overheadText")
    String overheadText;

    @ObfuscatedName("an")
    @Export("isAutoChatting")
    boolean isAutoChatting;

    @ObfuscatedName("aw")
    boolean field1125;

    @ObfuscatedName("aj")
    @ObfuscatedGetter(intValue = -1970261047)
    @Export("overheadTextCyclesRemaining")
    int overheadTextCyclesRemaining;

    @ObfuscatedName("ax")
    @ObfuscatedGetter(intValue = -937479283)
    @Export("overheadTextColor")
    int overheadTextColor;

    @ObfuscatedName("ah")
    @ObfuscatedGetter(intValue = 1627200621)
    @Export("overheadTextEffect")
    int overheadTextEffect;

    @ObfuscatedName("am")
    @Export("hitSplatCount")
    byte hitSplatCount;

    @ObfuscatedName("be")
    @Export("hitSplatTypes")
    int[] hitSplatTypes;

    @ObfuscatedName("bt")
    @Export("hitSplatValues")
    int[] hitSplatValues;

    @ObfuscatedName("bn")
    @Export("hitSplatCycles")
    int[] hitSplatCycles;

    @ObfuscatedName("bz")
    @Export("hitSplatTypes2")
    int[] hitSplatTypes2;

    @ObfuscatedName("bx")
    @Export("hitSplatValues2")
    int[] hitSplatValues2;

    @ObfuscatedName("bd")
    @ObfuscatedSignature(descriptor = "Llt;")
    @Export("healthBars")
    IterableNodeDeque healthBars;

    @ObfuscatedName("bg")
    @ObfuscatedGetter(intValue = -1691855669)
    @Export("targetIndex")
    int targetIndex;

    @ObfuscatedName("bm")
    @Export("false0")
    boolean false0;

    @ObfuscatedName("bi")
    @ObfuscatedGetter(intValue = -1033132539)
    int field1138;

    @ObfuscatedName("bw")
    boolean field1139;

    @ObfuscatedName("bu")
    @ObfuscatedGetter(intValue = -1663876733)
    @Export("movementSequence")
    int movementSequence;

    @ObfuscatedName("bs")
    @ObfuscatedGetter(intValue = 1595654321)
    @Export("movementFrame")
    int movementFrame;

    @ObfuscatedName("bb")
    @ObfuscatedGetter(intValue = 1011424269)
    @Export("movementFrameCycle")
    int movementFrameCycle;

    @ObfuscatedName("br")
    @ObfuscatedGetter(intValue = 1298635805)
    @Export("sequence")
    int sequence;

    @ObfuscatedName("bh")
    @ObfuscatedGetter(intValue = 1540339873)
    @Export("sequenceFrame")
    int sequenceFrame;

    @ObfuscatedName("bf")
    @ObfuscatedGetter(intValue = 2004238425)
    @Export("sequenceFrameCycle")
    int sequenceFrameCycle;

    @ObfuscatedName("bq")
    @ObfuscatedGetter(intValue = 787094505)
    @Export("sequenceDelay")
    int sequenceDelay;

    @ObfuscatedName("ba")
    @ObfuscatedGetter(intValue = 1322705901)
    int field1129;

    @ObfuscatedName("bv")
    @ObfuscatedGetter(intValue = 396275835)
    @Export("spotAnimation")
    int spotAnimation;

    @ObfuscatedName("bl")
    @ObfuscatedGetter(intValue = 1643722141)
    @Export("spotAnimationFrame")
    int spotAnimationFrame;

    @ObfuscatedName("bc")
    @ObfuscatedGetter(intValue = 1349072047)
    @Export("spotAnimationFrameCycle")
    int spotAnimationFrameCycle;

    @ObfuscatedName("bj")
    @ObfuscatedGetter(intValue = 1845348051)
    int field1177;

    @ObfuscatedName("bo")
    @ObfuscatedGetter(intValue = -467239947)
    @Export("spotAnimationHeight")
    int spotAnimationHeight;

    @ObfuscatedName("by")
    @ObfuscatedGetter(intValue = -416942467)
    int field1153;

    @ObfuscatedName("bk")
    @ObfuscatedGetter(intValue = -543666705)
    int field1147;

    @ObfuscatedName("bp")
    @ObfuscatedGetter(intValue = -205198277)
    int field1144;

    @ObfuscatedName("ch")
    @ObfuscatedGetter(intValue = -201847185)
    int field1156;

    @ObfuscatedName("cf")
    @ObfuscatedGetter(intValue = 673923399)
    int field1157;

    @ObfuscatedName("cg")
    @ObfuscatedGetter(intValue = -1026665477)
    int field1158;

    @ObfuscatedName("cu")
    @ObfuscatedGetter(intValue = 697476967)
    int field1159;

    @ObfuscatedName("cw")
    @ObfuscatedGetter(intValue = -689072625)
    @Export("npcCycle")
    int npcCycle;

    @ObfuscatedName("cb")
    @ObfuscatedGetter(intValue = 2136104267)
    @Export("defaultHeight")
    int defaultHeight;

    @ObfuscatedName("cq")
    @ObfuscatedGetter(intValue = -289145949)
    int field1162;

    @ObfuscatedName("cd")
    @ObfuscatedGetter(intValue = -1244014409)
    int field1163;

    @ObfuscatedName("cc")
    byte field1164;

    @ObfuscatedName("cs")
    byte field1155;

    @ObfuscatedName("cl")
    byte field1166;

    @ObfuscatedName("ck")
    byte field1167;

    @ObfuscatedName("cy")
    @ObfuscatedGetter(intValue = -95170499)
    @Export("orientation")
    int orientation;

    @ObfuscatedName("cn")
    @ObfuscatedGetter(intValue = 158152849)
    int field1169;

    @ObfuscatedName("cr")
    @ObfuscatedGetter(intValue = 416354727)
    int field1170;

    @ObfuscatedName("co")
    @ObfuscatedGetter(intValue = -1741409561)
    @Export("pathLength")
    int pathLength;

    @ObfuscatedName("cj")
    @Export("pathX")
    int[] pathX;

    @ObfuscatedName("ci")
    @Export("pathY")
    int[] pathY;

    @ObfuscatedName("ct")
    @ObfuscatedSignature(descriptor = "[Lgl;")
    @Export("pathTraversed")
    class185[] pathTraversed;

    @ObfuscatedName("ca")
    @ObfuscatedGetter(intValue = 1133647813)
    int field1175;

    @ObfuscatedName("cx")
    @ObfuscatedGetter(intValue = -1203587855)
    int field1176;

    @ObfuscatedName("cz")
    @ObfuscatedGetter(intValue = 1607900017)
    int field1135;

    Actor() {
        this.isWalking = false;
        this.field1113 = 1;
        this.idleSequence = -1;
        this.turnLeftSequence = -1;
        this.turnRightSequence = -1;
        this.walkSequence = -1;
        this.walkBackSequence = -1;
        this.walkLeftSequence = -1;
        this.walkRightSequence = -1;
        this.runSequence = -1;
        this.overheadText = null;
        this.field1125 = false;
        this.overheadTextCyclesRemaining = 100;
        this.overheadTextColor = 0;
        this.overheadTextEffect = 0;
        this.hitSplatCount = 0;
        this.hitSplatTypes = new int[4];
        this.hitSplatValues = new int[4];
        this.hitSplatCycles = new int[4];
        this.hitSplatTypes2 = new int[4];
        this.hitSplatValues2 = new int[4];
        this.healthBars = new IterableNodeDeque();
        this.targetIndex = -1;
        this.false0 = false;
        this.field1138 = -1;
        this.movementSequence = -1;
        this.movementFrame = 0;
        this.movementFrameCycle = 0;
        this.sequence = -1;
        this.sequenceFrame = 0;
        this.sequenceFrameCycle = 0;
        this.sequenceDelay = 0;
        this.field1129 = 0;
        this.spotAnimation = -1;
        this.spotAnimationFrame = 0;
        this.spotAnimationFrameCycle = 0;
        this.npcCycle = 0;
        this.defaultHeight = 200;
        this.field1162 = -1;
        this.field1163 = -1;
        this.field1169 = 0;
        this.field1170 = 32;
        this.pathLength = 0;
        this.pathX = new int[10];
        this.pathY = new int[10];
        this.pathTraversed = new class185[10];
        this.field1175 = 0;
        this.field1176 = 0;
        this.field1135 = -1;
    }

    @ObfuscatedName("d")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1570210948")
    @Export("isVisible")
    boolean isVisible() {
        return false;
    }

    @ObfuscatedName("bg")
    @ObfuscatedSignature(descriptor = "(S)V", garbageValue = "128")
    final void method2163() {
        this.pathLength = 0;
        this.field1176 = 0;
    }

    @ObfuscatedName("bm")
    @ObfuscatedSignature(descriptor = "(IIIIIII)V", garbageValue = "181453594")
    @Export("addHitSplat")
    final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
        boolean var7 = true;
        boolean var8 = true;
        int var9;
        for (var9 = 0; var9 < 4; ++var9) {
            if (this.hitSplatCycles[var9] > var5) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        var9 = -1;
        int var10 = -1;
        int var11 = 0;
        if (var1 >= 0) {
            HitSplatDefinition var12 = class293.method5480(var1);
            var10 = var12.field1961;
            var11 = var12.field1944;
        }
        int var14;
        if (var8) {
            if (var10 == (-1)) {
                return;
            }
            var9 = 0;
            var14 = 0;
            if (var10 == 0) {
                var14 = this.hitSplatCycles[0];
            } else if (var10 == 1) {
                var14 = this.hitSplatValues[0];
            }
            for (int var13 = 1; var13 < 4; ++var13) {
                if (var10 == 0) {
                    if (this.hitSplatCycles[var13] < var14) {
                        var9 = var13;
                        var14 = this.hitSplatCycles[var13];
                    }
                } else if ((var10 == 1) && (this.hitSplatValues[var13] < var14)) {
                    var9 = var13;
                    var14 = this.hitSplatValues[var13];
                }
            }
            if ((var10 == 1) && (var14 >= var2)) {
                return;
            }
        } else {
            if (var7) {
                this.hitSplatCount = 0;
            }
            for (var14 = 0; var14 < 4; ++var14) {
                byte var15 = this.hitSplatCount;
                this.hitSplatCount = ((byte) ((this.hitSplatCount + 1) % 4));
                if (this.hitSplatCycles[var15] <= var5) {
                    var9 = var15;
                    break;
                }
            }
        }
        if (var9 >= 0) {
            this.hitSplatTypes[var9] = var1;
            this.hitSplatValues[var9] = var2;
            this.hitSplatTypes2[var9] = var3;
            this.hitSplatValues2[var9] = var4;
            this.hitSplatCycles[var9] = (var5 + var11) + var6;
        }
    }

    @ObfuscatedName("bi")
    @ObfuscatedSignature(descriptor = "(IIIIIII)V", garbageValue = "1401747345")
    @Export("addHealthBar")
    final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
        HealthBarDefinition var7 = NetSocket.method3073(var1);
        HealthBar var8 = null;
        HealthBar var9 = null;
        int var10 = var7.int2;
        int var11 = 0;
        HealthBar var12;
        for (var12 = ((HealthBar) (this.healthBars.last())); var12 != null; var12 = ((HealthBar) (this.healthBars.previous()))) {
            ++var11;
            if (var12.definition.field1809 == var7.field1809) {
                var12.put(var2 + var4, var5, var6, var3);
                return;
            }
            if (var12.definition.int1 <= var7.int1) {
                var8 = var12;
            }
            if (var12.definition.int2 > var10) {
                var9 = var12;
                var10 = var12.definition.int2;
            }
        }
        if ((var9 != null) || (var11 < 4)) {
            var12 = new HealthBar(var7);
            if (var8 == null) {
                this.healthBars.addLast(var12);
            } else {
                IterableNodeDeque.IterableNodeDeque_addBefore(var12, var8);
            }
            var12.put(var2 + var4, var5, var6, var3);
            if (var11 >= 4) {
                var9.remove();
            }
        }
    }

    @ObfuscatedName("bw")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-2080014177")
    @Export("removeHealthBar")
    final void removeHealthBar(int var1) {
        HealthBarDefinition var2 = NetSocket.method3073(var1);
        for (HealthBar var3 = ((HealthBar) (this.healthBars.last())); var3 != null; var3 = ((HealthBar) (this.healthBars.previous()))) {
            if (var2 == var3.definition) {
                var3.remove();
                return;
            }
        }
    }

    @ObfuscatedName("ap")
    @ObfuscatedSignature(descriptor = "(ILbl;ZI)I", garbageValue = "-1069281222")
    static int method2176(int var0, Script var1, boolean var2) {
        if (var0 == ScriptOpcodes.FRIEND_COUNT) {
            if (ClanSettings.friendSystem.field810 == 0) {
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -2;
            } else if (ClanSettings.friendSystem.field810 == 1) {
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
            } else {
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ClanSettings.friendSystem.friendsList.getSize();
            }
            return 1;
        } else {
            int var3;
            if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
                var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                if ((ClanSettings.friendSystem.method1675() && (var3 >= 0)) && (var3 < ClanSettings.friendSystem.friendsList.getSize())) {
                    Friend var8 = ((Friend) (ClanSettings.friendSystem.friendsList.get(var3)));
                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var8.getName();
                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var8.getPreviousName();
                } else {
                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                }
                return 1;
            } else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
                var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                if ((ClanSettings.friendSystem.method1675() && (var3 >= 0)) && (var3 < ClanSettings.friendSystem.friendsList.getSize())) {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((Buddy) (ClanSettings.friendSystem.friendsList.get(var3))).world;
                } else {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                }
                return 1;
            } else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
                var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                if ((ClanSettings.friendSystem.method1675() && (var3 >= 0)) && (var3 < ClanSettings.friendSystem.friendsList.getSize())) {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((Buddy) (ClanSettings.friendSystem.friendsList.get(var3))).rank;
                } else {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                }
                return 1;
            } else {
                String var5;
                if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
                    var5 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                    int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                    class12.method158(var5, var6);
                    return 1;
                } else if (var0 == ScriptOpcodes.FRIEND_ADD) {
                    var5 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                    ClanSettings.friendSystem.addFriend(var5);
                    return 1;
                } else if (var0 == ScriptOpcodes.FRIEND_DEL) {
                    var5 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                    ClanSettings.friendSystem.removeFriend(var5);
                    return 1;
                } else if (var0 == ScriptOpcodes.IGNORE_ADD) {
                    var5 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                    ClanSettings.friendSystem.addIgnore(var5);
                    return 1;
                } else if (var0 == ScriptOpcodes.IGNORE_DEL) {
                    var5 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                    ClanSettings.friendSystem.removeIgnore(var5);
                    return 1;
                } else if (var0 == ScriptOpcodes.FRIEND_TEST) {
                    var5 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                    var5 = PlayerComposition.method5380(var5);
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (ClanSettings.friendSystem.isFriended(new Username(var5, VarcInt.loginType), false)) ? 1 : 0;
                    return 1;
                } else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
                    if (class67.friendsChat != null) {
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = class67.friendsChat.name;
                    } else {
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                    }
                    return 1;
                } else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
                    if (class67.friendsChat != null) {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = class67.friendsChat.getSize();
                    } else {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                    }
                    return 1;
                } else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
                    var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                    if ((class67.friendsChat != null) && (var3 < class67.friendsChat.getSize())) {
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = class67.friendsChat.get(var3).getUsername().getName();
                    } else {
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                    }
                    return 1;
                } else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
                    var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                    if ((class67.friendsChat != null) && (var3 < class67.friendsChat.getSize())) {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((Buddy) (class67.friendsChat.get(var3))).getWorld();
                    } else {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                    }
                    return 1;
                } else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
                    var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                    if ((class67.friendsChat != null) && (var3 < class67.friendsChat.getSize())) {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((Buddy) (class67.friendsChat.get(var3))).rank;
                    } else {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                    }
                    return 1;
                } else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (class67.friendsChat != null) ? class67.friendsChat.minKick : 0;
                    return 1;
                } else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
                    var5 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                    UserList.clanKickUser(var5);
                    return 1;
                } else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (class67.friendsChat != null) ? (class67.friendsChat.rank * 149836569) * 362371369 : 0;
                    return 1;
                } else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
                    var5 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                    Fonts.Clan_joinChat(var5);
                    return 1;
                } else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
                    class333.Clan_leaveChat();
                    return 1;
                } else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
                    if (!ClanSettings.friendSystem.method1675()) {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
                    } else {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ClanSettings.friendSystem.ignoreList.getSize();
                    }
                    return 1;
                } else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
                    var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                    if ((ClanSettings.friendSystem.method1675() && (var3 >= 0)) && (var3 < ClanSettings.friendSystem.ignoreList.getSize())) {
                        Ignored var4 = ((Ignored) (ClanSettings.friendSystem.ignoreList.get(var3)));
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var4.getName();
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var4.getPreviousName();
                    } else {
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                    }
                    return 1;
                } else if (var0 == ScriptOpcodes.IGNORE_TEST) {
                    var5 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                    var5 = PlayerComposition.method5380(var5);
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (ClanSettings.friendSystem.isIgnored(new Username(var5, VarcInt.loginType))) ? 1 : 0;
                    return 1;
                } else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
                    var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                    if (((class67.friendsChat != null) && (var3 < class67.friendsChat.getSize())) && class67.friendsChat.get(var3).getUsername().equals(WorldMapSprite.localPlayer.username)) {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 1;
                    } else {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                    }
                    return 1;
                } else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
                    if ((class67.friendsChat != null) && (class67.friendsChat.owner != null)) {
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = class67.friendsChat.owner;
                    } else {
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                    }
                    return 1;
                } else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
                    var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                    if (((class67.friendsChat != null) && (var3 < class67.friendsChat.getSize())) && ((ClanMate) (class67.friendsChat.get(var3))).isFriend()) {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 1;
                    } else {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                    }
                    return 1;
                } else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
                    if (var0 == 3628) {
                        ClanSettings.friendSystem.friendsList.removeComparator();
                        return 1;
                    } else {
                        boolean var7;
                        if (var0 == 3629) {
                            var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                            ClanSettings.friendSystem.friendsList.addComparator(new UserComparator1(var7));
                            return 1;
                        } else if (var0 == 3630) {
                            var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                            ClanSettings.friendSystem.friendsList.addComparator(new UserComparator2(var7));
                            return 1;
                        } else if (var0 == 3631) {
                            var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                            ClanSettings.friendSystem.friendsList.addComparator(new UserComparator3(var7));
                            return 1;
                        } else if (var0 == 3632) {
                            var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                            ClanSettings.friendSystem.friendsList.addComparator(new UserComparator4(var7));
                            return 1;
                        } else if (var0 == 3633) {
                            var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                            ClanSettings.friendSystem.friendsList.addComparator(new UserComparator5(var7));
                            return 1;
                        } else if (var0 == 3634) {
                            var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                            ClanSettings.friendSystem.friendsList.addComparator(new UserComparator6(var7));
                            return 1;
                        } else if (var0 == 3635) {
                            var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                            ClanSettings.friendSystem.friendsList.addComparator(new UserComparator7(var7));
                            return 1;
                        } else if (var0 == 3636) {
                            var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                            ClanSettings.friendSystem.friendsList.addComparator(new UserComparator8(var7));
                            return 1;
                        } else if (var0 == 3637) {
                            var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                            ClanSettings.friendSystem.friendsList.addComparator(new UserComparator9(var7));
                            return 1;
                        } else if (var0 == 3638) {
                            var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                            ClanSettings.friendSystem.friendsList.addComparator(new UserComparator10(var7));
                            return 1;
                        } else if (var0 == 3639) {
                            ClanSettings.friendSystem.friendsList.sort();
                            return 1;
                        } else if (var0 == 3640) {
                            ClanSettings.friendSystem.ignoreList.removeComparator();
                            return 1;
                        } else if (var0 == 3641) {
                            var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                            ClanSettings.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
                            return 1;
                        } else if (var0 == 3642) {
                            var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                            ClanSettings.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
                            return 1;
                        } else if (var0 == 3643) {
                            ClanSettings.friendSystem.ignoreList.sort();
                            return 1;
                        } else if (var0 == 3644) {
                            if (class67.friendsChat != null) {
                                class67.friendsChat.removeComparator();
                            }
                            return 1;
                        } else if (var0 == 3645) {
                            var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                            if (class67.friendsChat != null) {
                                class67.friendsChat.addComparator(new UserComparator1(var7));
                            }
                            return 1;
                        } else if (var0 == 3646) {
                            var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                            if (class67.friendsChat != null) {
                                class67.friendsChat.addComparator(new UserComparator2(var7));
                            }
                            return 1;
                        } else if (var0 == 3647) {
                            var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                            if (class67.friendsChat != null) {
                                class67.friendsChat.addComparator(new UserComparator3(var7));
                            }
                            return 1;
                        } else if (var0 == 3648) {
                            var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                            if (class67.friendsChat != null) {
                                class67.friendsChat.addComparator(new UserComparator4(var7));
                            }
                            return 1;
                        } else if (var0 == 3649) {
                            var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                            if (class67.friendsChat != null) {
                                class67.friendsChat.addComparator(new UserComparator5(var7));
                            }
                            return 1;
                        } else if (var0 == 3650) {
                            var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                            if (class67.friendsChat != null) {
                                class67.friendsChat.addComparator(new UserComparator6(var7));
                            }
                            return 1;
                        } else if (var0 == 3651) {
                            var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                            if (class67.friendsChat != null) {
                                class67.friendsChat.addComparator(new UserComparator7(var7));
                            }
                            return 1;
                        } else if (var0 == 3652) {
                            var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                            if (class67.friendsChat != null) {
                                class67.friendsChat.addComparator(new UserComparator8(var7));
                            }
                            return 1;
                        } else if (var0 == 3653) {
                            var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                            if (class67.friendsChat != null) {
                                class67.friendsChat.addComparator(new UserComparator9(var7));
                            }
                            return 1;
                        } else if (var0 == 3654) {
                            var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                            if (class67.friendsChat != null) {
                                class67.friendsChat.addComparator(new UserComparator10(var7));
                            }
                            return 1;
                        } else if (var0 == 3655) {
                            if (class67.friendsChat != null) {
                                class67.friendsChat.sort();
                            }
                            return 1;
                        } else if (var0 == 3656) {
                            var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                            ClanSettings.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
                            return 1;
                        } else if (var0 == 3657) {
                            var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                            if (class67.friendsChat != null) {
                                class67.friendsChat.addComparator(new BuddyRankComparator(var7));
                            }
                            return 1;
                        } else {
                            return 2;
                        }
                    }
                } else {
                    var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                    if (((class67.friendsChat != null) && (var3 < class67.friendsChat.getSize())) && ((ClanMate) (class67.friendsChat.get(var3))).isIgnored()) {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 1;
                    } else {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                    }
                    return 1;
                }
            }
        }
    }

    @ObfuscatedName("fi")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1401199237")
    static int method2178() {
        if ((Client.archiveLoaders != null) && (Client.archiveLoadersDone < Client.archiveLoaders.size())) {
            int var0 = 0;
            for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
                var0 += ((ArchiveLoader) (Client.archiveLoaders.get(var1))).loadedCount;
            }
            return (var0 * 10000) / Client.field698;
        } else {
            return 10000;
        }
    }

    @ObfuscatedName("ki")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-235298598")
    static final void method2177() {
        for (int var0 = 0; var0 < Players.Players_count; ++var0) {
            Player var1 = Client.players[Players.Players_indices[var0]];
            var1.method2105();
        }
    }
}