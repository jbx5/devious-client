import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
@Implements("ClientPacket")
public class ClientPacket implements class278 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket NO_TIMEOUT = new ClientPacket(0, 0);
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPOBJ5 = new ClientPacket(1, 7);
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3166 = new ClientPacket(2, -1);
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket EVENT_MOUSE_CLICK = new ClientPacket(3, 6);
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPLOC4 = new ClientPacket(4, 7);
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   static final ClientPacket field3109 = new ClientPacket(5, 7);
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket FRIEND_ADDUSER = new ClientPacket(6, -1);
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket CHAT_SETFILTER = new ClientPacket(7, 3);
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket EVENT_CAMERA_POSITION = new ClientPacket(8, 4);
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPNPC4 = new ClientPacket(9, 3);
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket EVENT_WINDOW_SETTING = new ClientPacket(10, 5);
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPPLAYER8 = new ClientPacket(11, 3);
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3073 = new ClientPacket(12, 4);
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3074 = new ClientPacket(13, -1);
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket CHAT_SENDPRIVATE = new ClientPacket(14, -2);
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3160 = new ClientPacket(15, -1);
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPOBJ4 = new ClientPacket(16, 7);
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3069 = new ClientPacket(17, 11);
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket IF_BUTTON3 = new ClientPacket(18, 8);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket FRIEND_DELUSER = new ClientPacket(19, -1);
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPNPCE = new ClientPacket(20, 2);
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket CLAN_KICKUSER = new ClientPacket(21, -1);
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket IF_BUTTON4 = new ClientPacket(22, 8);
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPLOC1 = new ClientPacket(23, 7);
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3085 = new ClientPacket(24, -1);
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket IF_BUTTON10 = new ClientPacket(25, 8);
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3087 = new ClientPacket(26, -1);
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3088 = new ClientPacket(27, 16);
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket LOGIN_TIMINGS = new ClientPacket(28, -1);
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket WIDGET_TYPE = new ClientPacket(29, 4);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPPLAYER7 = new ClientPacket(30, 3);
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3092 = new ClientPacket(31, 2);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPNPC1 = new ClientPacket(32, 3);
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3133 = new ClientPacket(33, -1);
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3095 = new ClientPacket(34, -1);
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket DETECT_MODIFIED_CLIENT = new ClientPacket(35, 4);
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3099 = new ClientPacket(36, 8);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPPLAYER1 = new ClientPacket(37, 3);
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPOBJ3 = new ClientPacket(38, 7);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket EVENT_APPLET_FOCUS = new ClientPacket(39, 1);
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3101 = new ClientPacket(40, 13);
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPLOC2 = new ClientPacket(41, 7);
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket RESUME_STRINGDIALOG = new ClientPacket(42, -1);
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3162 = new ClientPacket(43, 8);
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3105 = new ClientPacket(44, 8);
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   static final ClientPacket field3113 = new ClientPacket(45, -1);
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3128 = new ClientPacket(46, -1);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3108 = new ClientPacket(47, 11);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket PING_STATISTICS = new ClientPacket(48, 10);
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPPLAYER6 = new ClientPacket(49, 3);
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPPLAYER5 = new ClientPacket(50, 3);
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3080 = new ClientPacket(51, 14);
   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket DOCHEAT = new ClientPacket(52, -1);
   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3114 = new ClientPacket(53, -1);
   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket RESUME_NAMEDIALOG = new ClientPacket(54, -1);
   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket IF_BUTTON2 = new ClientPacket(55, 8);
   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3117 = new ClientPacket(56, 15);
   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket IF_BUTTON8 = new ClientPacket(57, 8);
   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPHELDD = new ClientPacket(58, 16);
   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPNPC2 = new ClientPacket(59, 3);
   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPPLAYERT = new ClientPacket(60, 11);
   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket IGNORE_DELUSER = new ClientPacket(61, -1);
   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket IF_BUTTON1 = new ClientPacket(62, 8);
   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPNPC5 = new ClientPacket(63, 3);
   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3125 = new ClientPacket(64, 8);
   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPLOC5 = new ClientPacket(65, 7);
   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   static final ClientPacket field3127 = new ClientPacket(66, -1);
   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPLOC3 = new ClientPacket(67, 7);
   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket IF_BUTTONT = new ClientPacket(68, 16);
   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3130 = new ClientPacket(69, -2);
   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPNPC3 = new ClientPacket(70, 3);
   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket REFLECTION_CHECK_REPLY = new ClientPacket(71, -1);
   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3090 = new ClientPacket(72, 9);
   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   static final ClientPacket field3134 = new ClientPacket(73, 2);
   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket RESUME_COUNTDIALOG = new ClientPacket(74, 4);
   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket IF_BUTTON6 = new ClientPacket(75, 8);
   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3137 = new ClientPacket(76, 8);
   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   static final ClientPacket field3086 = new ClientPacket(77, -1);
   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket IF_BUTTON7 = new ClientPacket(78, 8);
   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket EVENT_MOUSE_IDLE = new ClientPacket(79, 0);
   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPLOCE = new ClientPacket(80, 2);
   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3142 = new ClientPacket(81, 8);
   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPOBJT = new ClientPacket(82, 15);
   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket IF_BUTTOND = new ClientPacket(83, 9);
   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3135 = new ClientPacket(84, 0);
   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket IF_BUTTON5 = new ClientPacket(85, 8);
   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket RESUME_OBJDIALOG = new ClientPacket(86, 2);
   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPOBJE = new ClientPacket(87, 6);
   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPPLAYER4 = new ClientPacket(88, 3);
   @ObfuscatedName("ct")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3094 = new ClientPacket(89, 8);
   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3106 = new ClientPacket(90, 8);
   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3152 = new ClientPacket(91, 8);
   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPPLAYER2 = new ClientPacket(92, 3);
   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket EVENT_KEYBOARD = new ClientPacket(93, -2);
   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket RESUME_PAUSEBUTTON = new ClientPacket(94, 6);
   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3156 = new ClientPacket(95, 15);
   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPPLAYER3 = new ClientPacket(96, 3);
   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket MOVE_GAMECLICK = new ClientPacket(97, -1);
   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket FREECAM_EXIT = new ClientPacket(98, 0);
   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3164 = new ClientPacket(99, 22);
   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket CLOSE_MODAL = new ClientPacket(100, 0);
   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPOBJ2 = new ClientPacket(101, 7);
   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket IF_BUTTON9 = new ClientPacket(102, 8);
   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket field3138 = new ClientPacket(103, 8);
   @ObfuscatedName("dw")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPOBJ1 = new ClientPacket(104, 7);
   @ObfuscatedName("dz")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPLOCT = new ClientPacket(105, 15);
   @ObfuscatedName("db")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket CHAT_SENDABUSEREPORT = new ClientPacket(106, -1);
   @ObfuscatedName("di")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   public static final ClientPacket OPNPCT = new ClientPacket(107, 11);
   @ObfuscatedName("dy")
   @ObfuscatedGetter(
      intValue = -643615111
   )
   @Export("id")
   final int id;
   @ObfuscatedName("dg")
   @ObfuscatedGetter(
      intValue = 314168543
   )
   @Export("length")
   final int length;

   ClientPacket(int var1, int var2) {
      this.id = var1;
      this.length = var2;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(II)Lqh;",
      garbageValue = "-1211249310"
   )
   @Export("getDbTableType")
   public static DbTableType getDbTableType(int var0) {
      DbTableType var1 = (DbTableType)DbTableType.DBTableType_cache.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = DbTableType.field4910.takeFile(39, var0);
         var1 = new DbTableType();
         if (var2 != null) {
            var1.method8536(new Buffer(var2));
         }

         var1.method8538();
         DbTableType.DBTableType_cache.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IS)[B",
      garbageValue = "26868"
   )
   @Export("ByteArrayPool_getArray")
   public static synchronized byte[] ByteArrayPool_getArray(int var0) {
      return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false);
   }

   @ObfuscatedName("iw")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1519615884"
   )
   @Export("updateItemPile")
   static final void updateItemPile(int var0, int var1) {
      NodeDeque var2 = Client.groundItems[class103.Client_plane][var0][var1];
      if (var2 == null) {
         WorldMapAreaData.scene.removeGroundItemPile(class103.Client_plane, var0, var1);
      } else {
         long var3 = -99999999L;
         TileItem var5 = null;

         TileItem var6;
         for(var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
            ItemComposition var7 = TileItem.ItemDefinition_get(var6.id);
            long var11 = (long)var7.price;
            if (var7.isStackable == 1) {
               var11 *= var6.quantity < Integer.MAX_VALUE ? (long)(var6.quantity + 1) : (long)var6.quantity;
            }

            if (var11 > var3) {
               var3 = var11;
               var5 = var6;
            }
         }

         if (var5 == null) {
            WorldMapAreaData.scene.removeGroundItemPile(class103.Client_plane, var0, var1);
         } else {
            var2.addLast(var5);
            TileItem var13 = null;
            TileItem var8 = null;

            for(var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
               if (var5.id != var6.id) {
                  if (var13 == null) {
                     var13 = var6;
                  }

                  if (var6.id != var13.id && var8 == null) {
                     var8 = var6;
                  }
               }
            }

            long var9 = ItemLayer.calculateTag(var0, var1, 3, false, 0);
            WorldMapAreaData.scene.newGroundItemPile(class103.Client_plane, var0, var1, GrandExchangeOfferNameComparator.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, class103.Client_plane), var5, var9, var13, var8);
         }
      }
   }

   @ObfuscatedName("ii")
   @ObfuscatedSignature(
      descriptor = "(ZLru;I)V",
      garbageValue = "1090469082"
   )
   @Export("updateNpcs")
   static final void updateNpcs(boolean var0, PacketBuffer var1) {
      Client.field634 = 0;
      Client.field557 = 0;
      class17.method221(var1);

      int var2;
      int var3;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var23;
      while(true) {
         var2 = ServerPacket.field3307 ? 16 : 15;
         var3 = 1 << var2;
         if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) < var2 + 12) {
            break;
         }

         int var4 = var1.readBits(var2);
         if (var4 == var3 - 1) {
            break;
         }

         boolean var5 = false;
         if (Client.npcs[var4] == null) {
            Client.npcs[var4] = new NPC();
            var5 = true;
         }

         NPC var20 = Client.npcs[var4];
         Client.npcIndices[++Client.npcCount - 1] = var4;
         var20.npcCycle = Client.cycle;
         if (ServerPacket.field3307) {
            var10 = Client.defaultRotations[var1.readBits(3)];
            if (var5) {
               var20.orientation = var20.rotation = var10;
            }

            if (var0) {
               var8 = var1.readBits(8);
               if (var8 > 127) {
                  var8 -= 256;
               }
            } else {
               var8 = var1.readBits(5);
               if (var8 > 15) {
                  var8 -= 32;
               }
            }

            var11 = var1.readBits(1);
            if (var11 == 1) {
               Client.field558[++Client.field557 - 1] = var4;
            }

            boolean var12 = var1.readBits(1) == 1;
            if (var12) {
               var1.readBits(32);
            }

            var7 = var1.readBits(1);
            if (var0) {
               var9 = var1.readBits(8);
               if (var9 > 127) {
                  var9 -= 256;
               }
            } else {
               var9 = var1.readBits(5);
               if (var9 > 15) {
                  var9 -= 32;
               }
            }

            var20.definition = class137.getNpcDefinition(var1.readBits(14));
         } else {
            if (var0) {
               var9 = var1.readBits(8);
               if (var9 > 127) {
                  var9 -= 256;
               }
            } else {
               var9 = var1.readBits(5);
               if (var9 > 15) {
                  var9 -= 32;
               }
            }

            var20.definition = class137.getNpcDefinition(var1.readBits(14));
            boolean var22 = var1.readBits(1) == 1;
            if (var22) {
               var1.readBits(32);
            }

            var11 = var1.readBits(1);
            if (var11 == 1) {
               Client.field558[++Client.field557 - 1] = var4;
            }

            var23 = Client.defaultRotations[var1.readBits(3)];
            if (var5) {
               var20.orientation = var20.rotation = var23;
            }

            if (var0) {
               var8 = var1.readBits(8);
               if (var8 > 127) {
                  var8 -= 256;
               }
            } else {
               var8 = var1.readBits(5);
               if (var8 > 15) {
                  var8 -= 32;
               }
            }

            var7 = var1.readBits(1);
         }

         WorldMapID.method5339(var20);
         if (var20.field1228 == 0) {
            var20.rotation = 0;
         }

         var20.method2618(class387.localPlayer.pathX[0] + var8, class387.localPlayer.pathY[0] + var9, var7 == 1);
      }

      var1.exportIndex();

      for(var2 = 0; var2 < Client.field557; ++var2) {
         var3 = Client.field558[var2];
         NPC var14 = Client.npcs[var3];
         int var21 = var1.readUnsignedByte();
         int var6;
         if ((var21 & 2) != 0) {
            var6 = var1.readUnsignedByte();
            var21 += var6 << 8;
         }

         if ((var21 & 16384) != 0) {
            var6 = var1.readUnsignedByte();
            var21 += var6 << 16;
         }

         if ((var21 & 16) != 0) {
            var14.targetIndex = var1.readUnsignedShortAddLE();
            if (ServerPacket.field3307) {
               var14.targetIndex += var1.readUnsignedByteSub() << 16;
               var6 = 16777215;
            } else {
               var6 = 65535;
            }

            if (var6 == var14.targetIndex) {
               var14.targetIndex = -1;
            }
         }

         if ((var21 & 64) != 0) {
            var6 = var1.readUnsignedShortAddLE();
            if (var6 == 65535) {
               var6 = -1;
            }

            var7 = var1.readUnsignedByteAdd();
            if (var6 == var14.sequence && var6 != -1) {
               var8 = class85.SequenceDefinition_get(var6).field2308;
               if (var8 == 1) {
                  var14.sequenceFrame = 0;
                  var14.sequenceFrameCycle = 0;
                  var14.sequenceDelay = var7;
                  var14.field1205 = 0;
               }

               if (var8 == 2) {
                  var14.field1205 = 0;
               }
            } else if (var6 == -1 || var14.sequence == -1 || class85.SequenceDefinition_get(var6).field2292 >= class85.SequenceDefinition_get(var14.sequence).field2292) {
               var14.sequence = var6;
               var14.sequenceFrame = 0;
               var14.sequenceFrameCycle = 0;
               var14.sequenceDelay = var7;
               var14.field1205 = 0;
               var14.field1230 = var14.pathLength;
            }
         }

         if ((var21 & 4096) != 0) {
            var14.method2614(var1.readUnsignedByte());
         }

         int[] var15;
         short[] var16;
         short[] var17;
         long var18;
         if ((var21 & '耀') != 0) {
            var6 = var1.readUnsignedByteSub();
            if ((var6 & 1) == 1) {
               var14.method2630();
            } else {
               var15 = null;
               if ((var6 & 2) == 2) {
                  var8 = var1.readUnsignedByte();
                  var15 = new int[var8];

                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var1.readUnsignedShortAdd();
                     var10 = var10 == 65535 ? -1 : var10;
                     var15[var9] = var10;
                  }
               }

               var16 = null;
               if ((var6 & 4) == 4) {
                  var9 = 0;
                  if (var14.definition.recolorTo != null) {
                     var9 = var14.definition.recolorTo.length;
                  }

                  var16 = new short[var9];

                  for(var10 = 0; var10 < var9; ++var10) {
                     var16[var10] = (short)var1.readUnsignedShort();
                  }
               }

               var17 = null;
               if ((var6 & 8) == 8) {
                  var10 = 0;
                  if (var14.definition.retextureTo != null) {
                     var10 = var14.definition.retextureTo.length;
                  }

                  var17 = new short[var10];

                  for(var11 = 0; var11 < var10; ++var11) {
                     var17[var11] = (short)var1.readUnsignedShortAddLE();
                  }
               }

               var18 = (long)(++NPC.field1295 - 1);
               var14.method2639(new NewStuff(var18, var15, var16, var17));
            }
         }

         if ((var21 & 256) != 0) {
            var14.field1211 = var1.readByteSub();
            var14.field1213 = var1.readByteNeg();
            var14.field1212 = var1.readByteAdd();
            var14.field1214 = var1.readByteSub();
            var14.field1215 = var1.readUnsignedShort() + Client.cycle;
            var14.field1189 = var1.readUnsignedShort() + Client.cycle;
            var14.field1217 = var1.readUnsignedShortAdd();
            var14.pathLength = 1;
            var14.field1230 = 0;
            var14.field1211 += var14.pathX[0];
            var14.field1213 += var14.pathY[0];
            var14.field1212 += var14.pathX[0];
            var14.field1214 += var14.pathY[0];
         }

         if ((var21 & 128) != 0) {
            var6 = var1.readUnsignedShortAddLE();
            var7 = var1.readUnsignedShortAdd();
            var14.field1196 = var1.readUnsignedByte() == 1;
            var8 = var14.x - (var6 - ParamComposition.baseX * 64 - ParamComposition.baseX * 64) * 64;
            var9 = var14.y - (var7 - Client.baseY * 64 - Client.baseY * 64) * 64;
            if (var8 != 0 || var9 != 0) {
               var14.field1195 = (int)(Math.atan2((double)var8, (double)var9) * 325.949) & 2047;
            }
         }

         if ((var21 & 2048) != 0) {
            var14.field1220 = var1.readInt();
         }

         if ((var21 & 131072) != 0) {
            var6 = var1.readUnsignedByte();
            var15 = new int[8];
            var16 = new short[8];

            for(var9 = 0; var9 < 8; ++var9) {
               if ((var6 & 1 << var9) != 0) {
                  var15[var9] = var1.readNullableLargeSmart();
                  var16[var9] = (short)var1.readShortSmartSub();
               } else {
                  var15[var9] = -1;
                  var16[var9] = -1;
               }
            }

            var14.method2612(var15, var16);
         }

         if ((var21 & 1024) != 0) {
            var14.method2613(var1.readStringCp1252NullTerminated());
         }

         if ((var21 & 65536) != 0) {
            var6 = var1.readUnsignedIntME();
            var14.turnLeftSequence = (var6 & 1) != 0 ? var1.readUnsignedShortLE() : var14.definition.turnLeftSequence;
            var14.turnRightSequence = (var6 & 2) != 0 ? var1.readUnsignedShortLE() : var14.definition.turnRightSequence;
            var14.walkSequence = (var6 & 4) != 0 ? var1.readUnsignedShortLE() : var14.definition.walkSequence;
            var14.walkBackSequence = (var6 & 8) != 0 ? var1.readUnsignedShortAddLE() : var14.definition.walkBackSequence;
            var14.walkLeftSequence = (var6 & 16) != 0 ? var1.readUnsignedShortLE() : var14.definition.walkLeftSequence;
            var14.walkRightSequence = (var6 & 32) != 0 ? var1.readUnsignedShortLE() : var14.definition.walkRightSequence;
            var14.runSequence = (var6 & 64) != 0 ? var1.readUnsignedShort() : var14.definition.field2039;
            var14.field1173 = (var6 & 128) != 0 ? var1.readUnsignedShort() : var14.definition.field2040;
            var14.field1174 = (var6 & 256) != 0 ? var1.readUnsignedShortAddLE() : var14.definition.field2059;
            var14.field1168 = (var6 & 512) != 0 ? var1.readUnsignedShortLE() : var14.definition.field2042;
            var14.field1187 = (var6 & 1024) != 0 ? var1.readUnsignedShortAddLE() : var14.definition.field2043;
            var14.field1172 = (var6 & 2048) != 0 ? var1.readUnsignedShort() : var14.definition.field2065;
            var14.field1178 = (var6 & 4096) != 0 ? var1.readUnsignedShortAdd() : var14.definition.field2045;
            var14.field1179 = (var6 & 8192) != 0 ? var1.readUnsignedShortAddLE() : var14.definition.field2057;
            var14.idleSequence = (var6 & 16384) != 0 ? var1.readUnsignedShortLE() : var14.definition.idleSequence;
         }

         if ((var21 & 32) != 0) {
            var6 = var1.readUnsignedByte();
            if (var6 > 0) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var9 = -1;
                  var10 = -1;
                  var11 = -1;
                  var8 = var1.readUShortSmart();
                  if (var8 == 32767) {
                     var8 = var1.readUShortSmart();
                     var10 = var1.readUShortSmart();
                     var9 = var1.readUShortSmart();
                     var11 = var1.readUShortSmart();
                  } else if (var8 != 32766) {
                     var10 = var1.readUShortSmart();
                  } else {
                     var8 = -1;
                  }

                  var23 = var1.readUShortSmart();
                  var14.addHitSplat(var8, var10, var9, var11, Client.cycle, var23);
               }
            }

            var7 = var1.readUnsignedByteSub();
            if (var7 > 0) {
               for(var8 = 0; var8 < var7; ++var8) {
                  var9 = var1.readUShortSmart();
                  var10 = var1.readUShortSmart();
                  if (var10 != 32767) {
                     var11 = var1.readUShortSmart();
                     var23 = var1.readUnsignedByteNeg();
                     int var13 = var10 > 0 ? var1.readUnsignedByteNeg() : var23;
                     var14.addHealthBar(var9, Client.cycle, var10, var11, var23, var13);
                  } else {
                     var14.removeHealthBar(var9);
                  }
               }
            }
         }

         if ((var21 & 8) != 0) {
            var14.overheadText = var1.readStringCp1252NullTerminated();
            var14.overheadTextCyclesRemaining = 100;
         }

         if ((var21 & 512) != 0) {
            var14.field1176 = Client.cycle + var1.readUnsignedShortAdd();
            var14.field1221 = Client.cycle + var1.readUnsignedShort();
            var14.field1180 = var1.readByte();
            var14.field1227 = var1.readByteNeg();
            var14.field1224 = var1.readByteAdd();
            var14.field1225 = (byte)var1.readUnsignedByteSub();
         }

         if ((var21 & 1) != 0) {
            var14.spotAnimation = var1.readUnsignedShortAdd();
            var6 = var1.readInt();
            var14.spotAnimationHeight = var6 >> 16;
            var14.field1207 = (var6 & '\uffff') + Client.cycle;
            var14.spotAnimationFrame = 0;
            var14.spotAnimationFrameCycle = 0;
            if (var14.field1207 > Client.cycle) {
               var14.spotAnimationFrame = -1;
            }

            if (var14.spotAnimation == 65535) {
               var14.spotAnimation = -1;
            }
         }

         if ((var21 & 8192) != 0) {
            var6 = var1.readUnsignedByteSub();
            if ((var6 & 1) == 1) {
               var14.method2674();
            } else {
               var15 = null;
               if ((var6 & 2) == 2) {
                  var8 = var1.readUnsignedByteSub();
                  var15 = new int[var8];

                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var1.readUnsignedShortLE();
                     var10 = var10 == 65535 ? -1 : var10;
                     var15[var9] = var10;
                  }
               }

               var16 = null;
               if ((var6 & 4) == 4) {
                  var9 = 0;
                  if (var14.definition.recolorTo != null) {
                     var9 = var14.definition.recolorTo.length;
                  }

                  var16 = new short[var9];

                  for(var10 = 0; var10 < var9; ++var10) {
                     var16[var10] = (short)var1.readUnsignedShortAddLE();
                  }
               }

               var17 = null;
               if ((var6 & 8) == 8) {
                  var10 = 0;
                  if (var14.definition.retextureTo != null) {
                     var10 = var14.definition.retextureTo.length;
                  }

                  var17 = new short[var10];

                  for(var11 = 0; var11 < var10; ++var11) {
                     var17[var11] = (short)var1.readUnsignedShortAddLE();
                  }
               }

               var18 = (long)(++NPC.field1296 - 1);
               var14.method2626(new NewStuff(var18, var15, var16, var17));
            }
         }

         if ((var21 & 4) != 0) {
            var14.definition = class137.getNpcDefinition(var1.readUnsignedShortAdd());
            WorldMapID.method5339(var14);
            var14.method2628();
         }
      }

      for(var2 = 0; var2 < Client.field634; ++var2) {
         var3 = Client.field635[var2];
         if (Client.npcs[var3].npcCycle != Client.cycle) {
            Client.npcs[var3].definition = null;
            Client.npcs[var3] = null;
         }
      }

      if (var1.offset != Client.packetWriter.serverPacketLength) {
         throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
      } else {
         for(var2 = 0; var2 < Client.npcCount; ++var2) {
            if (Client.npcs[Client.npcIndices[var2]] == null) {
               throw new RuntimeException(var2 + "," + Client.npcCount);
            }
         }

      }
   }
}
