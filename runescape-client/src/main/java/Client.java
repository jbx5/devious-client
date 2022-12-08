import com.jagex.oldscape.pub.OtlTokenRequester;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import netscape.javascript.JSObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi {
   @ObfuscatedName("st")
   @ObfuscatedSignature(
      descriptor = "[Lep;"
   )
   @Export("currentClanSettings")
   static ClanSettings[] currentClanSettings;
   @ObfuscatedName("sw")
   @Export("playingJingle")
   static boolean playingJingle;
   @ObfuscatedName("vw")
   @ObfuscatedGetter(
      intValue = -461355959
   )
   public static int field801;
   @ObfuscatedName("uj")
   @ObfuscatedGetter(
      intValue = 304920807
   )
   @Export("viewportOffsetX")
   static int viewportOffsetX;
   @ObfuscatedName("ui")
   @ObfuscatedGetter(
      intValue = 658238419
   )
   @Export("viewportOffsetY")
   static int viewportOffsetY;
   @ObfuscatedName("ws")
   static int[] field806;
   @ObfuscatedName("sx")
   @ObfuscatedGetter(
      intValue = 1298103577
   )
   @Export("destinationX")
   static int destinationX;
   @ObfuscatedName("wt")
   static int[] field785;
   @ObfuscatedName("wd")
   @ObfuscatedSignature(
      descriptor = "Lbx;"
   )
   static final ApproximateRouteStrategy field805;
   @ObfuscatedName("su")
   @ObfuscatedGetter(
      intValue = -801254203
   )
   @Export("destinationY")
   static int destinationY;
   @ObfuscatedName("ts")
   @Export("isCameraLocked")
   static boolean isCameraLocked;
   @ObfuscatedName("th")
   static boolean field772;
   @ObfuscatedName("sz")
   @ObfuscatedGetter(
      intValue = 421577261
   )
   @Export("currentTrackGroupId")
   static int currentTrackGroupId;
   @ObfuscatedName("sj")
   @ObfuscatedSignature(
      descriptor = "[Lfn;"
   )
   @Export("currentClanChannels")
   static ClanChannel[] currentClanChannels;
   @ObfuscatedName("vg")
   @ObfuscatedSignature(
      descriptor = "[Lmz;"
   )
   @Export("grandExchangeOffers")
   static GrandExchangeOffer[] grandExchangeOffers;
   @ObfuscatedName("uc")
   @ObfuscatedGetter(
      intValue = 1282025529
   )
   static int field792;
   @ObfuscatedName("ur")
   @ObfuscatedSignature(
      descriptor = "Lko;"
   )
   @Export("playerAppearance")
   static PlayerComposition playerAppearance;
   @ObfuscatedName("ub")
   @ObfuscatedGetter(
      intValue = 1524201085
   )
   static int field793;
   @ObfuscatedName("vj")
   @Export("archiveLoaders")
   static ArrayList archiveLoaders;
   @ObfuscatedName("vt")
   @ObfuscatedGetter(
      intValue = -1259057673
   )
   @Export("archiveLoadersDone")
   static int archiveLoadersDone;
   @ObfuscatedName("tw")
   @ObfuscatedGetter(
      intValue = -604972557
   )
   @Export("soundEffectCount")
   static int soundEffectCount;
   @ObfuscatedName("to")
   @Export("soundEffectIds")
   static int[] soundEffectIds;
   @ObfuscatedName("tj")
   @Export("queuedSoundEffectLoops")
   static int[] queuedSoundEffectLoops;
   @ObfuscatedName("tf")
   @Export("queuedSoundEffectDelays")
   static int[] queuedSoundEffectDelays;
   @ObfuscatedName("sh")
   @ObfuscatedGetter(
      intValue = 1125738065
   )
   @Export("minimapState")
   static int minimapState;
   @ObfuscatedName("tr")
   @ObfuscatedSignature(
      descriptor = "[Lak;"
   )
   @Export("soundEffects")
   static SoundEffect[] soundEffects;
   @ObfuscatedName("vh")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("DBTableIndex_cache")
   static EvictingDualNodeHashTable DBTableIndex_cache;
   @ObfuscatedName("ta")
   @Export("soundLocations")
   static int[] soundLocations;
   @ObfuscatedName("vp")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("DBTableMasterIndex_cache")
   static EvictingDualNodeHashTable DBTableMasterIndex_cache;
   @ObfuscatedName("ud")
   @ObfuscatedSignature(
      descriptor = "Lpd;"
   )
   @Export("platformInfoProvider")
   static PlatformInfoProvider platformInfoProvider;
   @ObfuscatedName("ro")
   @ObfuscatedGetter(
      longValue = -7145298952818642997L
   )
   static long field679;
   @ObfuscatedName("sd")
   @ObfuscatedGetter(
      intValue = -1881747885
   )
   static int field619;
   @ObfuscatedName("vq")
   @ObfuscatedSignature(
      descriptor = "Lni;"
   )
   @Export("archive5")
   static class384 archive5;
   @ObfuscatedName("ut")
   static boolean[] field773;
   @ObfuscatedName("sg")
   @ObfuscatedGetter(
      intValue = -117040113
   )
   @Export("mapIconCount")
   static int mapIconCount;
   @ObfuscatedName("sl")
   @Export("mapIconXs")
   static int[] mapIconXs;
   @ObfuscatedName("sv")
   @Export("mapIconYs")
   static int[] mapIconYs;
   @ObfuscatedName("ul")
   static short field778;
   @ObfuscatedName("uz")
   static short field550;
   @ObfuscatedName("uh")
   static short field784;
   @ObfuscatedName("sq")
   @ObfuscatedSignature(
      descriptor = "[Lrx;"
   )
   @Export("mapIcons")
   static SpritePixels[] mapIcons;
   @ObfuscatedName("uy")
   static short field510;
   @ObfuscatedName("up")
   static short field783;
   @ObfuscatedName("uu")
   @ObfuscatedGetter(
      intValue = -2061488415
   )
   @Export("viewportZoom")
   static int viewportZoom;
   @ObfuscatedName("ua")
   static short field690;
   @ObfuscatedName("us")
   @ObfuscatedGetter(
      intValue = -509639003
   )
   @Export("viewportWidth")
   static int viewportWidth;
   @ObfuscatedName("vv")
   @ObfuscatedGetter(
      intValue = 1660289605
   )
   static int field804;
   @ObfuscatedName("uq")
   @ObfuscatedGetter(
      intValue = -897458695
   )
   @Export("viewportHeight")
   static int viewportHeight;
   @ObfuscatedName("ue")
   @Export("zoomHeight")
   static short zoomHeight;
   @ObfuscatedName("ug")
   @Export("zoomWidth")
   static short zoomWidth;
   @ObfuscatedName("ux")
   static int[] field775;
   @ObfuscatedName("uo")
   static int[] field803;
   @ObfuscatedName("un")
   static int[] field617;
   @ObfuscatedName("uv")
   static int[] field776;
   @ObfuscatedName("ve")
   @ObfuscatedSignature(
      descriptor = "Lbg;"
   )
   @Export("GrandExchangeEvents_worldComparator")
   static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
   @ObfuscatedName("vr")
   @ObfuscatedGetter(
      intValue = -2006147263
   )
   static int field800;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "[Lgw;"
   )
   @Export("collisionMaps")
   static CollisionMap[] collisionMaps;
   @ObfuscatedName("bh")
   static boolean field674 = true;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = -1786376969
   )
   @Export("worldId")
   public static int worldId = 1;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = -478869749
   )
   @Export("worldProperties")
   static int worldProperties = 0;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = 459972555
   )
   @Export("gameBuild")
   static int gameBuild = 0;
   @ObfuscatedName("bc")
   @Export("isMembersWorld")
   public static boolean isMembersWorld = false;
   @ObfuscatedName("bl")
   @Export("isLowDetail")
   static boolean isLowDetail = false;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = 905296419
   )
   static int field511 = -1;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = 505322101
   )
   @Export("clientType")
   static int clientType = -1;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 1427734597
   )
   static int field698 = -1;
   @ObfuscatedName("bn")
   @Export("onMobile")
   static boolean onMobile = false;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = -880846561
   )
   public static int field515 = 210;
   @ObfuscatedName("cc")
   @ObfuscatedGetter(
      intValue = 849546905
   )
   @Export("gameState")
   static int gameState = 0;
   @ObfuscatedName("dn")
   @Export("isLoading")
   static boolean isLoading = true;
   @ObfuscatedName("da")
   @ObfuscatedGetter(
      intValue = -1399173809
   )
   @Export("cycle")
   static int cycle = 0;
   @ObfuscatedName("de")
   @ObfuscatedGetter(
      longValue = -8630714732823869625L
   )
   @Export("mouseLastLastPressedTimeMillis")
   static long mouseLastLastPressedTimeMillis = 1L;
   @ObfuscatedName("dw")
   @ObfuscatedGetter(
      intValue = -1006687007
   )
   static int field520 = -1;
   @ObfuscatedName("dm")
   @ObfuscatedGetter(
      intValue = 89733947
   )
   static int field552 = -1;
   @ObfuscatedName("dv")
   @ObfuscatedGetter(
      longValue = 421294918074731913L
   )
   static long field522 = -1L;
   @ObfuscatedName("ds")
   @Export("hadFocus")
   static boolean hadFocus = true;
   @ObfuscatedName("dc")
   @ObfuscatedGetter(
      intValue = -1446195321
   )
   @Export("rebootTimer")
   static int rebootTimer = 0;
   @ObfuscatedName("dk")
   @ObfuscatedGetter(
      intValue = 1689383815
   )
   @Export("hintArrowType")
   static int hintArrowType = 0;
   @ObfuscatedName("df")
   @ObfuscatedGetter(
      intValue = 53054479
   )
   @Export("hintArrowNpcIndex")
   static int hintArrowNpcIndex = 0;
   @ObfuscatedName("dy")
   @ObfuscatedGetter(
      intValue = 689063901
   )
   @Export("hintArrowPlayerIndex")
   static int hintArrowPlayerIndex = 0;
   @ObfuscatedName("dx")
   @ObfuscatedGetter(
      intValue = -1525015337
   )
   @Export("hintArrowX")
   static int hintArrowX = 0;
   @ObfuscatedName("dr")
   @ObfuscatedGetter(
      intValue = -1084314735
   )
   @Export("hintArrowY")
   static int hintArrowY = 0;
   @ObfuscatedName("dd")
   @ObfuscatedGetter(
      intValue = 1831543250
   )
   @Export("hintArrowHeight")
   static int hintArrowHeight = 0;
   @ObfuscatedName("dg")
   @ObfuscatedGetter(
      intValue = -704083648
   )
   static int hintArrowSubX = 0;
   @ObfuscatedName("dq")
   @ObfuscatedGetter(
      intValue = 382549312
   )
   static int hintArrowSubY = 0;
   @ObfuscatedName("dt")
   @ObfuscatedSignature(
      descriptor = "Lcz;"
   )
   @Export("playerAttackOption")
   static AttackOption playerAttackOption;
   @ObfuscatedName("dp")
   @ObfuscatedSignature(
      descriptor = "Lcz;"
   )
   @Export("npcAttackOption")
   static AttackOption npcAttackOption;
   @ObfuscatedName("eh")
   @ObfuscatedGetter(
      intValue = -1081196793
   )
   @Export("titleLoadingStage")
   static int titleLoadingStage;
   @ObfuscatedName("ee")
   @ObfuscatedGetter(
      intValue = -419480225
   )
   @Export("js5ConnectState")
   static int js5ConnectState;
   @ObfuscatedName("em")
   @ObfuscatedGetter(
      intValue = -877919317
   )
   static int field537;
   @ObfuscatedName("fr")
   @ObfuscatedGetter(
      intValue = -321791745
   )
   @Export("js5Errors")
   static int js5Errors;
   @ObfuscatedName("fp")
   @ObfuscatedGetter(
      intValue = -83131829
   )
   @Export("loginState")
   static int loginState;
   @ObfuscatedName("fg")
   @ObfuscatedGetter(
      intValue = 924613849
   )
   static int field648;
   @ObfuscatedName("ff")
   @ObfuscatedGetter(
      intValue = 689653777
   )
   static int field541;
   @ObfuscatedName("ft")
   @ObfuscatedGetter(
      intValue = 1039768403
   )
   static int field527;
   @ObfuscatedName("fs")
   @ObfuscatedSignature(
      descriptor = "Let;"
   )
   static class132 field540;
   @ObfuscatedName("fh")
   @ObfuscatedSignature(
      descriptor = "Lrh;"
   )
   static class471 field640;
   @ObfuscatedName("gh")
   static final String field554;
   @ObfuscatedName("gr")
   @Export("Login_isUsernameRemembered")
   static boolean Login_isUsernameRemembered;
   @ObfuscatedName("gk")
   @ObfuscatedSignature(
      descriptor = "Lbb;"
   )
   @Export("secureRandomFuture")
   static SecureRandomFuture secureRandomFuture;
   @ObfuscatedName("gg")
   @Export("randomDatData")
   static byte[] randomDatData;
   @ObfuscatedName("gi")
   @ObfuscatedSignature(
      descriptor = "[Lcg;"
   )
   @Export("npcs")
   static NPC[] npcs;
   @ObfuscatedName("hs")
   @ObfuscatedGetter(
      intValue = 1742658927
   )
   @Export("npcCount")
   static int npcCount;
   @ObfuscatedName("hx")
   @Export("npcIndices")
   static int[] npcIndices;
   @ObfuscatedName("ho")
   @ObfuscatedGetter(
      intValue = -337463323
   )
   static int field564;
   @ObfuscatedName("he")
   static int[] field565;
   @ObfuscatedName("hn")
   @ObfuscatedSignature(
      descriptor = "Lde;"
   )
   @Export("packetWriter")
   public static final PacketWriter packetWriter;
   @ObfuscatedName("hf")
   @ObfuscatedGetter(
      intValue = 914543801
   )
   @Export("logoutTimer")
   static int logoutTimer;
   @ObfuscatedName("hr")
   @Export("hadNetworkError")
   static boolean hadNetworkError;
   @ObfuscatedName("hz")
   @ObfuscatedSignature(
      descriptor = "Lnh;"
   )
   @Export("timer")
   static Timer timer;
   @ObfuscatedName("hg")
   @Export("fontsMap")
   static HashMap fontsMap;
   @ObfuscatedName("hp")
   @ObfuscatedGetter(
      intValue = -1576974551
   )
   static int field601;
   @ObfuscatedName("hd")
   @ObfuscatedGetter(
      intValue = -674553043
   )
   static int field755;
   @ObfuscatedName("hu")
   @ObfuscatedGetter(
      intValue = -1304022513
   )
   static int field786;
   @ObfuscatedName("iq")
   @ObfuscatedGetter(
      intValue = 240003967
   )
   static int field574;
   @ObfuscatedName("ip")
   @ObfuscatedGetter(
      intValue = 1301428805
   )
   static int field658;
   @ObfuscatedName("it")
   @Export("selectedItemName")
   static String selectedItemName;
   @ObfuscatedName("iy")
   @Export("regionMapArchiveIds")
   static int[] regionMapArchiveIds;
   @ObfuscatedName("ia")
   @Export("isInInstance")
   static boolean isInInstance;
   @ObfuscatedName("im")
   @Export("instanceChunkTemplates")
   static int[][][] instanceChunkTemplates;
   @ObfuscatedName("in")
   static final int[] field579;
   @ObfuscatedName("ii")
   @ObfuscatedGetter(
      intValue = -1594730517
   )
   @Export("graphicsCycle")
   static int graphicsCycle;
   @ObfuscatedName("jm")
   @ObfuscatedGetter(
      intValue = -1593842591
   )
   static int field719;
   @ObfuscatedName("jl")
   @ObfuscatedGetter(
      intValue = -1767197721
   )
   static int field651;
   @ObfuscatedName("jq")
   @ObfuscatedGetter(
      intValue = 660716575
   )
   static int field532;
   @ObfuscatedName("jj")
   @ObfuscatedGetter(
      intValue = 1934461207
   )
   static int field584;
   @ObfuscatedName("jt")
   static boolean field689;
   @ObfuscatedName("jv")
   @ObfuscatedGetter(
      intValue = -606509143
   )
   @Export("alternativeScrollbarWidth")
   static int alternativeScrollbarWidth;
   @ObfuscatedName("jn")
   @ObfuscatedGetter(
      intValue = 1701036907
   )
   @Export("camAngleX")
   static int camAngleX;
   @ObfuscatedName("jx")
   @ObfuscatedGetter(
      intValue = -1633873355
   )
   @Export("camAngleY")
   static int camAngleY;
   @ObfuscatedName("jf")
   @ObfuscatedGetter(
      intValue = -110318655
   )
   static int camAngleDY;
   @ObfuscatedName("jh")
   @ObfuscatedGetter(
      intValue = 1894306029
   )
   static int camAngleDX;
   @ObfuscatedName("jo")
   @ObfuscatedGetter(
      intValue = -1822435885
   )
   static int field591;
   @ObfuscatedName("jg")
   @ObfuscatedGetter(
      intValue = -606441225
   )
   static int mouseCamClickedY;
   @ObfuscatedName("jc")
   @ObfuscatedGetter(
      intValue = 1951368499
   )
   @Export("oculusOrbState")
   static int oculusOrbState;
   @ObfuscatedName("ja")
   @ObfuscatedGetter(
      intValue = 1891106199
   )
   @Export("camFollowHeight")
   static int camFollowHeight;
   @ObfuscatedName("ka")
   @ObfuscatedGetter(
      intValue = -1280049195
   )
   static int field638;
   @ObfuscatedName("km")
   @ObfuscatedGetter(
      intValue = 205514029
   )
   static int field596;
   @ObfuscatedName("kl")
   @ObfuscatedGetter(
      intValue = -590989363
   )
   static int field597;
   @ObfuscatedName("kc")
   @ObfuscatedGetter(
      intValue = -904534999
   )
   @Export("oculusOrbNormalSpeed")
   static int oculusOrbNormalSpeed;
   @ObfuscatedName("kx")
   @ObfuscatedGetter(
      intValue = 807828661
   )
   @Export("oculusOrbSlowedSpeed")
   static int oculusOrbSlowedSpeed;
   @ObfuscatedName("ke")
   @ObfuscatedGetter(
      intValue = 230448641
   )
   public static int field789;
   @ObfuscatedName("kv")
   static boolean field529;
   @ObfuscatedName("ks")
   @ObfuscatedGetter(
      intValue = -2097151229
   )
   static int field807;
   @ObfuscatedName("ky")
   static boolean field603;
   @ObfuscatedName("kr")
   @ObfuscatedGetter(
      intValue = -64075329
   )
   static int field604;
   @ObfuscatedName("kb")
   @ObfuscatedGetter(
      intValue = -1080955203
   )
   @Export("overheadTextCount")
   static int overheadTextCount;
   @ObfuscatedName("kp")
   @ObfuscatedGetter(
      intValue = -251743249
   )
   @Export("overheadTextLimit")
   static int overheadTextLimit;
   @ObfuscatedName("ku")
   @Export("overheadTextXs")
   static int[] overheadTextXs;
   @ObfuscatedName("kt")
   @Export("overheadTextYs")
   static int[] overheadTextYs;
   @ObfuscatedName("ko")
   @Export("overheadTextAscents")
   static int[] overheadTextAscents;
   @ObfuscatedName("ki")
   @Export("overheadTextXOffsets")
   static int[] overheadTextXOffsets;
   @ObfuscatedName("kz")
   @Export("overheadTextColors")
   static int[] overheadTextColors;
   @ObfuscatedName("kd")
   @Export("overheadTextEffects")
   static int[] overheadTextEffects;
   @ObfuscatedName("kf")
   @Export("overheadTextCyclesRemaining")
   static int[] overheadTextCyclesRemaining;
   @ObfuscatedName("kq")
   @Export("overheadText")
   static String[] overheadText;
   @ObfuscatedName("kk")
   @Export("tileLastDrawnActor")
   static int[][] tileLastDrawnActor;
   @ObfuscatedName("kw")
   @ObfuscatedGetter(
      intValue = 1676158973
   )
   @Export("viewportDrawCount")
   static int viewportDrawCount;
   @ObfuscatedName("kj")
   @ObfuscatedGetter(
      intValue = -1444752263
   )
   @Export("viewportTempX")
   static int viewportTempX;
   @ObfuscatedName("kh")
   @ObfuscatedGetter(
      intValue = -1136866163
   )
   @Export("viewportTempY")
   static int viewportTempY;
   @ObfuscatedName("lb")
   @ObfuscatedGetter(
      intValue = -1284637171
   )
   @Export("mouseCrossX")
   static int mouseCrossX;
   @ObfuscatedName("lc")
   @ObfuscatedGetter(
      intValue = -1923066637
   )
   @Export("mouseCrossY")
   static int mouseCrossY;
   @ObfuscatedName("ll")
   @ObfuscatedGetter(
      intValue = -72070731
   )
   @Export("mouseCrossState")
   static int mouseCrossState;
   @ObfuscatedName("lk")
   @ObfuscatedGetter(
      intValue = -2144438923
   )
   @Export("mouseCrossColor")
   static int mouseCrossColor;
   @ObfuscatedName("lu")
   @Export("showMouseCross")
   static boolean showMouseCross;
   @ObfuscatedName("lg")
   @ObfuscatedGetter(
      intValue = -712957839
   )
   static int field624;
   @ObfuscatedName("ls")
   @ObfuscatedGetter(
      intValue = -1814256945
   )
   static int field625;
   @ObfuscatedName("lm")
   @ObfuscatedGetter(
      intValue = -2075416401
   )
   @Export("dragItemSlotSource")
   static int dragItemSlotSource;
   @ObfuscatedName("lh")
   @ObfuscatedGetter(
      intValue = 1800438489
   )
   @Export("draggedWidgetX")
   static int draggedWidgetX;
   @ObfuscatedName("lj")
   @ObfuscatedGetter(
      intValue = 778021723
   )
   @Export("draggedWidgetY")
   static int draggedWidgetY;
   @ObfuscatedName("li")
   @ObfuscatedGetter(
      intValue = 1981845999
   )
   @Export("dragItemSlotDestination")
   static int dragItemSlotDestination;
   @ObfuscatedName("le")
   static boolean field630;
   @ObfuscatedName("lq")
   @ObfuscatedGetter(
      intValue = 1731996675
   )
   @Export("itemDragDuration")
   static int itemDragDuration;
   @ObfuscatedName("lt")
   @ObfuscatedGetter(
      intValue = -279617941
   )
   static int field691;
   @ObfuscatedName("ln")
   @Export("showLoadingMessages")
   static boolean showLoadingMessages;
   @ObfuscatedName("ly")
   @ObfuscatedSignature(
      descriptor = "[Lcj;"
   )
   @Export("players")
   static Player[] players;
   @ObfuscatedName("lr")
   @ObfuscatedGetter(
      intValue = -653603109
   )
   @Export("localPlayerIndex")
   static int localPlayerIndex;
   @ObfuscatedName("lx")
   @ObfuscatedGetter(
      intValue = -1216879407
   )
   static int field692;
   @ObfuscatedName("la")
   @ObfuscatedGetter(
      longValue = -6907940148224560471L
   )
   static long field637;
   @ObfuscatedName("mn")
   @Export("renderSelf")
   static boolean renderSelf;
   @ObfuscatedName("ms")
   @ObfuscatedGetter(
      intValue = -1173896191
   )
   @Export("drawPlayerNames")
   static int drawPlayerNames;
   @ObfuscatedName("mk")
   @ObfuscatedGetter(
      intValue = 832020011
   )
   static int field779;
   @ObfuscatedName("me")
   static int[] field641;
   @ObfuscatedName("mb")
   @Export("playerMenuOpcodes")
   static final int[] playerMenuOpcodes;
   @ObfuscatedName("mr")
   @Export("playerMenuActions")
   static String[] playerMenuActions;
   @ObfuscatedName("mi")
   @Export("playerOptionsPriorities")
   static boolean[] playerOptionsPriorities;
   @ObfuscatedName("md")
   static int[] defaultRotations;
   @ObfuscatedName("mq")
   @ObfuscatedGetter(
      intValue = 444610161
   )
   @Export("combatTargetPlayerIndex")
   static int combatTargetPlayerIndex;
   @ObfuscatedName("mu")
   @ObfuscatedSignature(
      descriptor = "[[[Lmq;"
   )
   @Export("groundItems")
   static NodeDeque[][][] groundItems;
   @ObfuscatedName("mv")
   @ObfuscatedSignature(
      descriptor = "Lmq;"
   )
   @Export("pendingSpawns")
   static NodeDeque pendingSpawns;
   @ObfuscatedName("ma")
   @ObfuscatedSignature(
      descriptor = "Lmq;"
   )
   @Export("projectiles")
   static NodeDeque projectiles;
   @ObfuscatedName("mo")
   @ObfuscatedSignature(
      descriptor = "Lmq;"
   )
   @Export("graphicsObjects")
   static NodeDeque graphicsObjects;
   @ObfuscatedName("mm")
   @Export("currentLevels")
   static int[] currentLevels;
   @ObfuscatedName("mj")
   @Export("levels")
   static int[] levels;
   @ObfuscatedName("my")
   @Export("experience")
   static int[] experience;
   @ObfuscatedName("mp")
   @Export("leftClickOpensMenu")
   static boolean leftClickOpensMenu;
   @ObfuscatedName("mc")
   @Export("isMenuOpen")
   static boolean isMenuOpen;
   @ObfuscatedName("nm")
   @ObfuscatedGetter(
      intValue = 2013462879
   )
   @Export("menuOptionsCount")
   static int menuOptionsCount;
   @ObfuscatedName("nv")
   @Export("menuArguments1")
   static int[] menuArguments1;
   @ObfuscatedName("nu")
   @Export("menuArguments2")
   static int[] menuArguments2;
   @ObfuscatedName("ny")
   @Export("menuOpcodes")
   static int[] menuOpcodes;
   @ObfuscatedName("np")
   @Export("menuIdentifiers")
   static int[] menuIdentifiers;
   @ObfuscatedName("ne")
   @Export("menuItemIds")
   static int[] menuItemIds;
   @ObfuscatedName("na")
   @Export("menuActions")
   static String[] menuActions;
   @ObfuscatedName("nl")
   @Export("menuTargets")
   static String[] menuTargets;
   @ObfuscatedName("nk")
   @Export("menuShiftClick")
   static boolean[] menuShiftClick;
   @ObfuscatedName("nf")
   @Export("followerOpsLowPriority")
   static boolean followerOpsLowPriority;
   @ObfuscatedName("nh")
   @Export("shiftClickDrop")
   static boolean shiftClickDrop;
   @ObfuscatedName("nr")
   @Export("tapToDrop")
   static boolean tapToDrop;
   @ObfuscatedName("nd")
   @Export("showMouseOverText")
   static boolean showMouseOverText;
   @ObfuscatedName("no")
   @ObfuscatedGetter(
      intValue = -749158239
   )
   @Export("viewportX")
   static int viewportX;
   @ObfuscatedName("nq")
   @ObfuscatedGetter(
      intValue = 1174058235
   )
   @Export("viewportY")
   static int viewportY;
   @ObfuscatedName("nz")
   @ObfuscatedGetter(
      intValue = 165156689
   )
   static int field553;
   @ObfuscatedName("nj")
   @ObfuscatedGetter(
      intValue = -808600101
   )
   static int field521;
   @ObfuscatedName("nn")
   @ObfuscatedGetter(
      intValue = -1639704995
   )
   @Export("isItemSelected")
   static int isItemSelected;
   @ObfuscatedName("nc")
   @Export("isSpellSelected")
   static boolean isSpellSelected;
   @ObfuscatedName("oy")
   @ObfuscatedGetter(
      intValue = -825825707
   )
   @Export("selectedSpellChildIndex")
   static int selectedSpellChildIndex;
   @ObfuscatedName("og")
   @ObfuscatedGetter(
      intValue = -264024497
   )
   @Export("selectedSpellItemId")
   static int selectedSpellItemId;
   @ObfuscatedName("os")
   @Export("selectedSpellActionName")
   static String selectedSpellActionName;
   @ObfuscatedName("od")
   @Export("selectedSpellName")
   static String selectedSpellName;
   @ObfuscatedName("oq")
   @ObfuscatedGetter(
      intValue = -1495174825
   )
   @Export("rootInterface")
   static int rootInterface;
   @ObfuscatedName("oa")
   @ObfuscatedSignature(
      descriptor = "Lqp;"
   )
   @Export("interfaceParents")
   static NodeHashTable interfaceParents;
   @ObfuscatedName("ox")
   @ObfuscatedGetter(
      intValue = 341482921
   )
   static int field791;
   @ObfuscatedName("oi")
   @ObfuscatedGetter(
      intValue = 905492675
   )
   static int field683;
   @ObfuscatedName("oo")
   @ObfuscatedGetter(
      intValue = 812943257
   )
   @Export("chatEffects")
   static int chatEffects;
   @ObfuscatedName("on")
   @ObfuscatedGetter(
      intValue = 1322109871
   )
   static int field685;
   @ObfuscatedName("ok")
   @ObfuscatedSignature(
      descriptor = "Lkd;"
   )
   @Export("meslayerContinueWidget")
   static Widget meslayerContinueWidget;
   @ObfuscatedName("of")
   @ObfuscatedGetter(
      intValue = 809546495
   )
   @Export("runEnergy")
   static int runEnergy;
   @ObfuscatedName("ow")
   @ObfuscatedGetter(
      intValue = -761634595
   )
   @Export("weight")
   static int weight;
   @ObfuscatedName("op")
   @ObfuscatedGetter(
      intValue = 643587025
   )
   @Export("staffModLevel")
   static int staffModLevel;
   @ObfuscatedName("oj")
   @ObfuscatedGetter(
      intValue = -1825146679
   )
   @Export("followerIndex")
   static int followerIndex;
   @ObfuscatedName("oc")
   @Export("playerMod")
   static boolean playerMod;
   @ObfuscatedName("oz")
   @ObfuscatedSignature(
      descriptor = "Lkd;"
   )
   @Export("viewportWidget")
   static Widget viewportWidget;
   @ObfuscatedName("om")
   @ObfuscatedSignature(
      descriptor = "Lkd;"
   )
   @Export("clickedWidget")
   static Widget clickedWidget;
   @ObfuscatedName("ob")
   @ObfuscatedSignature(
      descriptor = "Lkd;"
   )
   @Export("clickedWidgetParent")
   static Widget clickedWidgetParent;
   @ObfuscatedName("or")
   @ObfuscatedGetter(
      intValue = 1107452813
   )
   @Export("widgetClickX")
   static int widgetClickX;
   @ObfuscatedName("pe")
   @ObfuscatedGetter(
      intValue = 1093404483
   )
   @Export("widgetClickY")
   static int widgetClickY;
   @ObfuscatedName("pv")
   @ObfuscatedSignature(
      descriptor = "Lkd;"
   )
   @Export("draggedOnWidget")
   static Widget draggedOnWidget;
   @ObfuscatedName("pa")
   static boolean field745;
   @ObfuscatedName("ps")
   @ObfuscatedGetter(
      intValue = 1291525931
   )
   static int field699;
   @ObfuscatedName("ph")
   @ObfuscatedGetter(
      intValue = -1906364423
   )
   static int field613;
   @ObfuscatedName("pu")
   static boolean field701;
   @ObfuscatedName("pf")
   @ObfuscatedGetter(
      intValue = -287645029
   )
   static int field519;
   @ObfuscatedName("pn")
   @ObfuscatedGetter(
      intValue = -1757770101
   )
   static int field703;
   @ObfuscatedName("px")
   @Export("isDraggingWidget")
   static boolean isDraggingWidget;
   @ObfuscatedName("po")
   @ObfuscatedGetter(
      intValue = 673017441
   )
   @Export("cycleCntr")
   static int cycleCntr;
   @ObfuscatedName("pl")
   static int[] changedVarps;
   @ObfuscatedName("pq")
   @ObfuscatedGetter(
      intValue = -535441981
   )
   static int changedVarpCount;
   @ObfuscatedName("pk")
   static int[] changedItemContainers;
   @ObfuscatedName("pd")
   @ObfuscatedGetter(
      intValue = 1841099769
   )
   static int field709;
   @ObfuscatedName("pc")
   static int[] changedSkills;
   @ObfuscatedName("pb")
   @ObfuscatedGetter(
      intValue = 2040914153
   )
   static int changedSkillsCount;
   @ObfuscatedName("pz")
   static int[] field712;
   @ObfuscatedName("pt")
   @ObfuscatedGetter(
      intValue = -2143156255
   )
   static int field713;
   @ObfuscatedName("pg")
   @ObfuscatedGetter(
      intValue = 756647275
   )
   @Export("chatCycle")
   static int chatCycle;
   @ObfuscatedName("pi")
   @ObfuscatedGetter(
      intValue = -1828686225
   )
   static int field715;
   @ObfuscatedName("ql")
   @ObfuscatedGetter(
      intValue = -1970316617
   )
   static int field610;
   @ObfuscatedName("qp")
   @ObfuscatedGetter(
      intValue = 166181489
   )
   static int field717;
   @ObfuscatedName("qn")
   @ObfuscatedGetter(
      intValue = 399726531
   )
   static int field513;
   @ObfuscatedName("qc")
   @ObfuscatedGetter(
      intValue = 1891329815
   )
   static int field777;
   @ObfuscatedName("qi")
   @ObfuscatedGetter(
      intValue = -252352091
   )
   static int field720;
   @ObfuscatedName("qt")
   @ObfuscatedGetter(
      intValue = -1748768741
   )
   static int field721;
   @ObfuscatedName("qd")
   @ObfuscatedGetter(
      intValue = -142840217
   )
   @Export("mouseWheelRotation")
   static int mouseWheelRotation;
   @ObfuscatedName("qj")
   @ObfuscatedSignature(
      descriptor = "Lrd;"
   )
   static class484 field505;
   @ObfuscatedName("qh")
   @ObfuscatedSignature(
      descriptor = "Lmq;"
   )
   @Export("scriptEvents")
   static NodeDeque scriptEvents;
   @ObfuscatedName("qr")
   @ObfuscatedSignature(
      descriptor = "Lmq;"
   )
   static NodeDeque field725;
   @ObfuscatedName("qg")
   @ObfuscatedSignature(
      descriptor = "Lmq;"
   )
   static NodeDeque field726;
   @ObfuscatedName("qo")
   @ObfuscatedSignature(
      descriptor = "Lmq;"
   )
   static NodeDeque field727;
   @ObfuscatedName("qs")
   @ObfuscatedSignature(
      descriptor = "Lqp;"
   )
   @Export("widgetFlags")
   static NodeHashTable widgetFlags;
   @ObfuscatedName("qm")
   @ObfuscatedGetter(
      intValue = 1685586111
   )
   @Export("rootWidgetCount")
   static int rootWidgetCount;
   @ObfuscatedName("qb")
   @ObfuscatedGetter(
      intValue = -582413719
   )
   static int field808;
   @ObfuscatedName("qw")
   static boolean[] field731;
   @ObfuscatedName("qe")
   static boolean[] field732;
   @ObfuscatedName("qx")
   static boolean[] field733;
   @ObfuscatedName("qy")
   @Export("rootWidgetXs")
   static int[] rootWidgetXs;
   @ObfuscatedName("qz")
   @Export("rootWidgetYs")
   static int[] rootWidgetYs;
   @ObfuscatedName("rf")
   @Export("rootWidgetWidths")
   static int[] rootWidgetWidths;
   @ObfuscatedName("rq")
   @Export("rootWidgetHeights")
   static int[] rootWidgetHeights;
   @ObfuscatedName("rk")
   @ObfuscatedGetter(
      intValue = -544956459
   )
   @Export("gameDrawingMode")
   static int gameDrawingMode;
   @ObfuscatedName("rh")
   @ObfuscatedGetter(
      longValue = -6655508283216562127L
   )
   static long field739;
   @ObfuscatedName("rl")
   @Export("isResizable")
   static boolean isResizable;
   @ObfuscatedName("ra")
   static int[] field741;
   @ObfuscatedName("rx")
   @ObfuscatedGetter(
      intValue = 1034069959
   )
   @Export("publicChatMode")
   static int publicChatMode;
   @ObfuscatedName("rs")
   @ObfuscatedGetter(
      intValue = -1887729789
   )
   @Export("tradeChatMode")
   static int tradeChatMode;
   @ObfuscatedName("rg")
   static String field744;
   @ObfuscatedName("rt")
   static long[] crossWorldMessageIds;
   @ObfuscatedName("rr")
   @ObfuscatedGetter(
      intValue = 1059950709
   )
   static int crossWorldMessageIdsIndex;
   @ObfuscatedName("rc")
   @ObfuscatedSignature(
      descriptor = "Lgc;"
   )
   public static class201 field747;
   @ObfuscatedName("re")
   @ObfuscatedSignature(
      descriptor = "Lgb;"
   )
   static class199 field572;
   @ObfuscatedName("rn")
   @ObfuscatedGetter(
      intValue = -400698351
   )
   static int field710;
   @ObfuscatedName("rb")
   static int[] field774;
   @ObfuscatedName("rw")
   static int[] field751;
   @ObfuscatedName("fj")
   String field781;
   @ObfuscatedName("fw")
   @ObfuscatedSignature(
      descriptor = "Ln;"
   )
   class14 field546;
   @ObfuscatedName("gf")
   @ObfuscatedSignature(
      descriptor = "Lt;"
   )
   class19 field547;
   @ObfuscatedName("go")
   OtlTokenRequester field548;
   @ObfuscatedName("gj")
   Future field549;
   @ObfuscatedName("gp")
   boolean field590 = false;
   @ObfuscatedName("gz")
   @ObfuscatedSignature(
      descriptor = "Lt;"
   )
   class19 field654;
   @ObfuscatedName("gl")
   @ObfuscatedSignature(
      descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
   )
   RefreshAccessTokenRequester field666;
   @ObfuscatedName("gq")
   Future field623;
   @ObfuscatedName("gt")
   @ObfuscatedSignature(
      descriptor = "Lqy;"
   )
   Buffer field557;
   @ObfuscatedName("gc")
   @ObfuscatedSignature(
      descriptor = "Lr;"
   )
   class7 field573;
   @ObfuscatedName("gw")
   @ObfuscatedGetter(
      longValue = -3708619133328893535L
   )
   long field559 = -1L;

   static {
      playerAttackOption = AttackOption.AttackOption_hidden;
      npcAttackOption = AttackOption.AttackOption_hidden;
      titleLoadingStage = 0;
      js5ConnectState = 0;
      field537 = 0;
      js5Errors = 0;
      loginState = 0;
      field648 = 0;
      field541 = 0;
      field527 = 0;
      field540 = class132.field1625;
      field640 = class471.field4976;
      int var1 = "com_jagex_auth_desktop_osrs:public".length();
      byte[] var2 = new byte[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = "com_jagex_auth_desktop_osrs:public".charAt(var3);
         if (var4 > 127) {
            var2[var3] = 63;
         } else {
            var2[var3] = (byte)var4;
         }
      }

      field554 = EnumComposition.method3650(var2);
      Login_isUsernameRemembered = false;
      secureRandomFuture = new SecureRandomFuture();
      randomDatData = null;
      npcs = new NPC[65536];
      npcCount = 0;
      npcIndices = new int[65536];
      field564 = 0;
      field565 = new int[250];
      packetWriter = new PacketWriter();
      logoutTimer = 0;
      hadNetworkError = false;
      timer = new Timer();
      fontsMap = new HashMap();
      field601 = 0;
      field755 = 1;
      field786 = 0;
      field574 = 1;
      field658 = 0;
      collisionMaps = new CollisionMap[4];
      isInInstance = false;
      instanceChunkTemplates = new int[4][13][13];
      field579 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      graphicsCycle = 0;
      field719 = 2301979;
      field651 = 5063219;
      field532 = 3353893;
      field584 = 7759444;
      field689 = false;
      alternativeScrollbarWidth = 0;
      camAngleX = 128;
      camAngleY = 0;
      camAngleDY = 0;
      camAngleDX = 0;
      field591 = 0;
      mouseCamClickedY = 0;
      oculusOrbState = 0;
      camFollowHeight = 50;
      field638 = 0;
      field596 = 0;
      field597 = 0;
      oculusOrbNormalSpeed = 12;
      oculusOrbSlowedSpeed = 6;
      field789 = 0;
      field529 = false;
      field807 = 0;
      field603 = false;
      field604 = 0;
      overheadTextCount = 0;
      overheadTextLimit = 50;
      overheadTextXs = new int[overheadTextLimit];
      overheadTextYs = new int[overheadTextLimit];
      overheadTextAscents = new int[overheadTextLimit];
      overheadTextXOffsets = new int[overheadTextLimit];
      overheadTextColors = new int[overheadTextLimit];
      overheadTextEffects = new int[overheadTextLimit];
      overheadTextCyclesRemaining = new int[overheadTextLimit];
      overheadText = new String[overheadTextLimit];
      tileLastDrawnActor = new int[104][104];
      viewportDrawCount = 0;
      viewportTempX = -1;
      viewportTempY = -1;
      mouseCrossX = 0;
      mouseCrossY = 0;
      mouseCrossState = 0;
      mouseCrossColor = 0;
      showMouseCross = true;
      field624 = 0;
      field625 = 0;
      dragItemSlotSource = 0;
      draggedWidgetX = 0;
      draggedWidgetY = 0;
      dragItemSlotDestination = 0;
      field630 = false;
      itemDragDuration = 0;
      field691 = 0;
      showLoadingMessages = true;
      players = new Player[2048];
      localPlayerIndex = -1;
      field692 = 0;
      field637 = -1L;
      renderSelf = true;
      drawPlayerNames = 0;
      field779 = 0;
      field641 = new int[1000];
      playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
      playerMenuActions = new String[8];
      playerOptionsPriorities = new boolean[8];
      defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
      combatTargetPlayerIndex = -1;
      groundItems = new NodeDeque[4][104][104];
      pendingSpawns = new NodeDeque();
      projectiles = new NodeDeque();
      graphicsObjects = new NodeDeque();
      currentLevels = new int[25];
      levels = new int[25];
      experience = new int[25];
      leftClickOpensMenu = false;
      isMenuOpen = false;
      menuOptionsCount = 0;
      menuArguments1 = new int[500];
      menuArguments2 = new int[500];
      menuOpcodes = new int[500];
      menuIdentifiers = new int[500];
      menuItemIds = new int[500];
      menuActions = new String[500];
      menuTargets = new String[500];
      menuShiftClick = new boolean[500];
      followerOpsLowPriority = false;
      shiftClickDrop = false;
      tapToDrop = false;
      showMouseOverText = true;
      viewportX = -1;
      viewportY = -1;
      field553 = 0;
      field521 = 50;
      isItemSelected = 0;
      selectedItemName = null;
      isSpellSelected = false;
      selectedSpellChildIndex = -1;
      selectedSpellItemId = -1;
      selectedSpellActionName = null;
      selectedSpellName = null;
      rootInterface = -1;
      interfaceParents = new NodeHashTable(8);
      field791 = 0;
      field683 = -1;
      chatEffects = 0;
      field685 = 0;
      meslayerContinueWidget = null;
      runEnergy = 0;
      weight = 0;
      staffModLevel = 0;
      followerIndex = -1;
      playerMod = false;
      viewportWidget = null;
      clickedWidget = null;
      clickedWidgetParent = null;
      widgetClickX = 0;
      widgetClickY = 0;
      draggedOnWidget = null;
      field745 = false;
      field699 = -1;
      field613 = -1;
      field701 = false;
      field519 = -1;
      field703 = -1;
      isDraggingWidget = false;
      cycleCntr = 1;
      changedVarps = new int[32];
      changedVarpCount = 0;
      changedItemContainers = new int[32];
      field709 = 0;
      changedSkills = new int[32];
      changedSkillsCount = 0;
      field712 = new int[32];
      field713 = 0;
      chatCycle = 0;
      field715 = 0;
      field610 = 0;
      field717 = 0;
      field513 = 0;
      field777 = 0;
      field720 = 0;
      field721 = 0;
      mouseWheelRotation = 0;
      field505 = new class484();
      scriptEvents = new NodeDeque();
      field725 = new NodeDeque();
      field726 = new NodeDeque();
      field727 = new NodeDeque();
      widgetFlags = new NodeHashTable(512);
      rootWidgetCount = 0;
      field808 = -2;
      field731 = new boolean[100];
      field732 = new boolean[100];
      field733 = new boolean[100];
      rootWidgetXs = new int[100];
      rootWidgetYs = new int[100];
      rootWidgetWidths = new int[100];
      rootWidgetHeights = new int[100];
      gameDrawingMode = 0;
      field739 = 0L;
      isResizable = true;
      field741 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
      publicChatMode = 0;
      tradeChatMode = 0;
      field744 = "";
      crossWorldMessageIds = new long[100];
      crossWorldMessageIdsIndex = 0;
      field747 = new class201();
      field572 = new class199();
      field710 = 0;
      field774 = new int[128];
      field751 = new int[128];
      field679 = -1L;
      currentClanSettings = new ClanSettings[4];
      currentClanChannels = new ClanChannel[4];
      field619 = -1;
      mapIconCount = 0;
      mapIconXs = new int[1000];
      mapIconYs = new int[1000];
      mapIcons = new SpritePixels[1000];
      destinationX = 0;
      destinationY = 0;
      minimapState = 0;
      currentTrackGroupId = -1;
      playingJingle = false;
      soundEffectCount = 0;
      soundEffectIds = new int[50];
      queuedSoundEffectLoops = new int[50];
      queuedSoundEffectDelays = new int[50];
      soundLocations = new int[50];
      soundEffects = new SoundEffect[50];
      isCameraLocked = false;
      field772 = false;
      field773 = new boolean[5];
      field803 = new int[5];
      field775 = new int[5];
      field776 = new int[5];
      field617 = new int[5];
      field778 = 256;
      field550 = 205;
      zoomHeight = 256;
      zoomWidth = 320;
      field690 = 1;
      field783 = 32767;
      field784 = 1;
      field510 = 32767;
      viewportOffsetX = 0;
      viewportOffsetY = 0;
      viewportWidth = 0;
      viewportHeight = 0;
      viewportZoom = 0;
      playerAppearance = new PlayerComposition();
      field792 = -1;
      field793 = -1;
      platformInfoProvider = new DesktopPlatformInfoProvider();
      grandExchangeOffers = new GrandExchangeOffer[8];
      GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
      archive5 = new class384(8, class382.field4481);
      DBTableIndex_cache = new EvictingDualNodeHashTable(64);
      DBTableMasterIndex_cache = new EvictingDualNodeHashTable(64);
      field800 = -1;
      field801 = -1;
      archiveLoaders = new ArrayList(10);
      archiveLoadersDone = 0;
      field804 = 0;
      field805 = new ApproximateRouteStrategy();
      field806 = new int[50];
      field785 = new int[50];
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-101"
   )
   @Export("resizeGame")
   protected final void resizeGame() {
      field739 = Message.method1197() + 500L;
      this.resizeJS();
      if (rootInterface != -1) {
         this.resizeRoot(true);
      }

   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
   )
   @Export("setUp")
   protected final void setUp() {
      int[] var1 = new int[]{20, 260, 10000};
      int[] var2 = new int[]{1000, 100, 500};
      if (var1 != null && var2 != null) {
         Frames.ByteArrayPool_alternativeSizes = var1;
         ModelData0.ByteArrayPool_altSizeArrayCounts = new int[var1.length];
         SceneTilePaint.ByteArrayPool_arrays = new byte[var1.length][][];

         for(int var3 = 0; var3 < Frames.ByteArrayPool_alternativeSizes.length; ++var3) {
            SceneTilePaint.ByteArrayPool_arrays[var3] = new byte[var2[var3]][];
            ByteArrayPool.field4446.add(var1[var3]);
         }

         Collections.sort(ByteArrayPool.field4446);
      } else {
         Frames.ByteArrayPool_alternativeSizes = null;
         ModelData0.ByteArrayPool_altSizeArrayCounts = null;
         SceneTilePaint.ByteArrayPool_arrays = null;
         ByteArrayPool.field4446.clear();
         ByteArrayPool.field4446.add(100);
         ByteArrayPool.field4446.add(5000);
         ByteArrayPool.field4446.add(10000);
         ByteArrayPool.field4446.add(30000);
      }

      ClanChannel.worldPort = gameBuild == 0 ? 'ꩊ' : worldId + '鱀';
      class137.js5Port = gameBuild == 0 ? 443 : worldId + '썐';
      class31.currentPort = ClanChannel.worldPort;
      class86.field1104 = class304.field3516;
      TriBool.field4548 = class304.field3515;
      NewStuff.field2017 = class304.field3521;
      Varps.field3445 = class304.field3517;
      TaskHandler.urlRequester = new class109(this.field590, 210);
      this.setUpKeyboard();
      this.method539();
      class86.mouseWheel = this.mouseWheel();
      this.method501(field572, 0);
      this.method501(field747, 1);
      WorldMapArea.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
      StructComposition.clientPreferences = class319.method6375();
      this.setUpClipboard();
      String var4 = BoundaryObject.field2787;
      class32.field182 = this;
      if (var4 != null) {
         class32.field183 = var4;
      }

      class101.setWindowedMode(StructComposition.clientPreferences.method2434());
      DefaultsGroup.friendSystem = new FriendSystem(SecureRandomFuture.loginType);
      this.field546 = new class14("tokenRequest", 1, 1);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-22"
   )
   @Export("doCycle")
   protected final void doCycle() {
      ++cycle;
      this.doCycleJs5();

      while(true) {
         ArchiveDiskAction var1;
         synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
            var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
         }

         if (var1 == null) {
            Occluder.method4627();
            playPcmPlayers();
            field747.method4103();
            this.method500();
            synchronized(MouseHandler.MouseHandler_instance) {
               MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
               MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
               MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
               MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
               MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
               MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
               MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
               MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
               MouseHandler.MouseHandler_lastButtonVolatile = 0;
            }

            if (class86.mouseWheel != null) {
               int var5 = class86.mouseWheel.useRotation();
               mouseWheelRotation = var5;
            }

            if (gameState == 0) {
               Tiles.load();
               class29.method430();
            } else if (gameState == 5) {
               PlayerCompositionColorTextureOverride.loginScreen(this, AbstractWorldMapData.fontPlain12);
               Tiles.load();
               class29.method430();
            } else if (gameState != 10 && gameState != 11) {
               if (gameState == 20) {
                  PlayerCompositionColorTextureOverride.loginScreen(this, AbstractWorldMapData.fontPlain12);
                  this.doCycleLoggedOut();
               } else if (gameState == 50) {
                  PlayerCompositionColorTextureOverride.loginScreen(this, AbstractWorldMapData.fontPlain12);
                  this.doCycleLoggedOut();
               } else if (gameState == 25) {
                  GameEngine.method667();
               }
            } else {
               PlayerCompositionColorTextureOverride.loginScreen(this, AbstractWorldMapData.fontPlain12);
            }

            if (gameState == 30) {
               this.doCycleLoggedIn();
            } else if (gameState == 40 || gameState == 45) {
               this.doCycleLoggedOut();
            }

            return;
         }

         var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false);
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "920051106"
   )
   @Export("draw")
   protected final void draw(boolean var1) {
      boolean var2 = class37.method701();
      if (var2 && playingJingle && TileItem.pcmPlayer0 != null) {
         TileItem.pcmPlayer0.tryDiscard();
      }

      if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field739 && Message.method1197() > field739) {
         class101.setWindowedMode(Message.getWindowedMode());
      }

      int var3;
      if (var1) {
         for(var3 = 0; var3 < 100; ++var3) {
            field731[var3] = true;
         }
      }

      if (gameState == 0) {
         this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
      } else if (gameState == 5) {
         class199.drawTitle(class146.fontBold12, class151.fontPlain11, AbstractWorldMapData.fontPlain12);
      } else if (gameState != 10 && gameState != 11) {
         if (gameState == 20) {
            class199.drawTitle(class146.fontBold12, class151.fontPlain11, AbstractWorldMapData.fontPlain12);
         } else if (gameState == 50) {
            class199.drawTitle(class146.fontBold12, class151.fontPlain11, AbstractWorldMapData.fontPlain12);
         } else if (gameState == 25) {
            if (field658 == 1) {
               if (field601 > field755) {
                  field755 = field601;
               }

               var3 = (field755 * 50 - field601 * 50) / field755;
               SoundSystem.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
            } else if (field658 == 2) {
               if (field786 > field574) {
                  field574 = field786;
               }

               var3 = (field574 * 50 - field786 * 50) / field574 + 50;
               SoundSystem.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
            } else {
               SoundSystem.drawLoadingMessage("Loading - please wait.", false);
            }
         } else if (gameState == 30) {
            this.drawLoggedIn();
         } else if (gameState == 40) {
            SoundSystem.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
         } else if (gameState == 45) {
            SoundSystem.drawLoadingMessage("Please wait...", false);
         }
      } else {
         class199.drawTitle(class146.fontBold12, class151.fontPlain11, AbstractWorldMapData.fontPlain12);
      }

      if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
         for(var3 = 0; var3 < rootWidgetCount; ++var3) {
            if (field732[var3]) {
               RouteStrategy.rasterProvider.draw(rootWidgetXs[var3], rootWidgetYs[var3], rootWidgetWidths[var3], rootWidgetHeights[var3]);
               field732[var3] = false;
            }
         }
      } else if (gameState > 0) {
         RouteStrategy.rasterProvider.drawFull(0, 0);

         for(var3 = 0; var3 < rootWidgetCount; ++var3) {
            field732[var3] = false;
         }
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1295386641"
   )
   @Export("kill0")
   protected final void kill0() {
      if (WorldMapArea.varcs.hasUnwrittenChanges()) {
         WorldMapArea.varcs.write();
      }

      if (class271.mouseRecorder != null) {
         class271.mouseRecorder.isRunning = false;
      }

      class271.mouseRecorder = null;
      packetWriter.close();
      if (MouseHandler.MouseHandler_instance != null) {
         synchronized(MouseHandler.MouseHandler_instance) {
            MouseHandler.MouseHandler_instance = null;
         }
      }

      class86.mouseWheel = null;
      if (TileItem.pcmPlayer0 != null) {
         TileItem.pcmPlayer0.shutdown();
      }

      if (UserComparator8.pcmPlayer1 != null) {
         UserComparator8.pcmPlayer1.shutdown();
      }

      class241.method5186();
      class182.method3634();
      if (TaskHandler.urlRequester != null) {
         TaskHandler.urlRequester.close();
         TaskHandler.urlRequester = null;
      }

      try {
         JagexCache.JagexCache_dat2File.close();

         for(int var3 = 0; var3 < class145.idxCount; ++var3) {
            JagexCache.JagexCache_idxFiles[var3].close();
         }

         JagexCache.JagexCache_idx255File.close();
         JagexCache.JagexCache_randomDat.close();
      } catch (Exception var5) {
      }

      this.field546.method171();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1344730333"
   )
   protected final void vmethod1227() {
   }

   @ObfuscatedName("fw")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "854239934"
   )
   boolean method1230() {
      return class146.field1717 != null && !class146.field1717.trim().isEmpty() && EnumComposition.field2006 != null && !EnumComposition.field2006.trim().isEmpty();
   }

   @ObfuscatedName("gf")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1394434953"
   )
   boolean method1231() {
      return this.field548 != null;
   }

   @ObfuscatedName("go")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-1380875152"
   )
   void method1655(String var1) throws IOException {
      HashMap var2 = new HashMap();
      var2.put("grant_type", "refresh_token");
      var2.put("scope", "gamesso.token.create");
      var2.put("refresh_token", var1);
      URL var3 = new URL(class17.field102 + "shield/oauth/token" + (new class423(var2)).method7925());
      HashMap var4 = new HashMap();
      var4.put("Authorization", "Basic " + field554);
      var4.put("Host", (new URL(class17.field102)).getHost());
      var4.put("Accept", class420.field4652.method7905());
      class9 var5 = class9.field43;
      RefreshAccessTokenRequester var6 = this.field666;
      if (var6 != null) {
         this.field623 = var6.request(var5.method70(), var3, var4, "");
      } else {
         class10 var7 = new class10(var3, var5, this.field590);
         Iterator var8 = var4.entrySet().iterator();

         while(var8.hasNext()) {
            Map.Entry var9 = (Map.Entry)var8.next();
            var7.method86((String)var9.getKey(), (String)var9.getValue());
         }

         this.field654 = this.field546.method167(var7);
      }
   }

   @ObfuscatedName("gj")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-426259759"
   )
   void method1233(String var1) throws MalformedURLException, IOException {
      URL var2 = new URL(class17.field102 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
      HashMap var3 = new HashMap();
      var3.put("Authorization", "Bearer " + var1);
      class9 var4 = class9.field33;
      OtlTokenRequester var5 = this.field548;
      if (var5 != null) {
         this.field549 = var5.request(var4.method70(), var2, var3, "");
      } else {
         class10 var6 = new class10(var2, var4, this.field590);
         Iterator var7 = var3.entrySet().iterator();

         while(var7.hasNext()) {
            Map.Entry var8 = (Map.Entry)var7.next();
            var6.method86((String)var8.getKey(), (String)var8.getValue());
         }

         this.field547 = this.field546.method167(var6);
      }
   }

   @ObfuscatedName("gz")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1825291822"
   )
   @Export("doCycleJs5")
   void doCycleJs5() {
      if (gameState != 1000) {
         boolean var1 = WallDecoration.method4830();
         if (!var1) {
            this.doCycleJs5Connect();
         }

      }
   }

   @ObfuscatedName("gl")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-924281456"
   )
   @Export("doCycleJs5Connect")
   void doCycleJs5Connect() {
      if (NetCache.NetCache_crcMismatches >= 4) {
         this.error("js5crc");
         class140.updateGameState(1000);
      } else {
         if (NetCache.NetCache_ioExceptions >= 4) {
            if (gameState <= 5) {
               this.error("js5io");
               class140.updateGameState(1000);
               return;
            }

            field537 = 3000;
            NetCache.NetCache_ioExceptions = 3;
         }

         if (--field537 + 1 <= 0) {
            try {
               if (js5ConnectState == 0) {
                  class357.js5SocketTask = class242.taskHandler.newSocketTask(class139.worldHost, class31.currentPort);
                  ++js5ConnectState;
               }

               if (js5ConnectState == 1) {
                  if (class357.js5SocketTask.status == 2) {
                     this.js5Error(-1);
                     return;
                  }

                  if (class357.js5SocketTask.status == 1) {
                     ++js5ConnectState;
                  }
               }

               Buffer var3;
               if (js5ConnectState == 2) {
                  Socket var2 = (Socket)class357.js5SocketTask.result;
                  BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000);
                  WorldMapIcon_1.js5Socket = var1;
                  var3 = new Buffer(5);
                  var3.writeByte(15);
                  var3.writeInt(210);
                  WorldMapIcon_1.js5Socket.write(var3.array, 0, 5);
                  ++js5ConnectState;
                  FileSystem.field1866 = Message.method1197();
               }

               if (js5ConnectState == 3) {
                  if (WorldMapIcon_1.js5Socket.available() > 0) {
                     int var5 = WorldMapIcon_1.js5Socket.readUnsignedByte();
                     if (var5 != 0) {
                        this.js5Error(var5);
                        return;
                     }

                     ++js5ConnectState;
                  } else if (Message.method1197() - FileSystem.field1866 > 30000L) {
                     this.js5Error(-2);
                     return;
                  }
               }

               if (js5ConnectState == 4) {
                  AbstractSocket var13 = WorldMapIcon_1.js5Socket;
                  boolean var6 = gameState > 20;
                  if (NetCache.NetCache_socket != null) {
                     try {
                        NetCache.NetCache_socket.close();
                     } catch (Exception var11) {
                     }

                     NetCache.NetCache_socket = null;
                  }

                  NetCache.NetCache_socket = var13;
                  if (NetCache.NetCache_socket != null) {
                     try {
                        var3 = new Buffer(4);
                        var3.writeByte(var6 ? 2 : 3);
                        var3.writeMedium(0);
                        NetCache.NetCache_socket.write(var3.array, 0, 4);
                     } catch (IOException var10) {
                        try {
                           NetCache.NetCache_socket.close();
                        } catch (Exception var9) {
                        }

                        ++NetCache.NetCache_ioExceptions;
                        NetCache.NetCache_socket = null;
                     }
                  }

                  NetCache.NetCache_responseHeaderBuffer.offset = 0;
                  NewStuff.NetCache_currentResponse = null;
                  ModeWhere.NetCache_responseArchiveBuffer = null;
                  NetCache.field4216 = 0;

                  while(true) {
                     NetFileRequest var14 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first();
                     if (var14 == null) {
                        while(true) {
                           var14 = (NetFileRequest)NetCache.NetCache_pendingResponses.first();
                           if (var14 == null) {
                              if (NetCache.field4232 != 0) {
                                 try {
                                    var3 = new Buffer(4);
                                    var3.writeByte(4);
                                    var3.writeByte(NetCache.field4232);
                                    var3.writeShort(0);
                                    NetCache.NetCache_socket.write(var3.array, 0, 4);
                                 } catch (IOException var8) {
                                    try {
                                       NetCache.NetCache_socket.close();
                                    } catch (Exception var7) {
                                    }

                                    ++NetCache.NetCache_ioExceptions;
                                    NetCache.NetCache_socket = null;
                                 }
                              }

                              NetCache.NetCache_loadTime = 0;
                              NetCache.field4218 = Message.method1197();
                              class357.js5SocketTask = null;
                              WorldMapIcon_1.js5Socket = null;
                              js5ConnectState = 0;
                              js5Errors = 0;
                              return;
                           }

                           NetCache.NetCache_pendingWritesQueue.addLast(var14);
                           NetCache.NetCache_pendingWrites.put(var14, var14.key);
                           ++NetCache.NetCache_pendingWritesCount;
                           --NetCache.NetCache_pendingResponsesCount;
                        }
                     }

                     NetCache.NetCache_pendingPriorityWrites.put(var14, var14.key);
                     ++NetCache.NetCache_pendingPriorityWritesCount;
                     --NetCache.NetCache_pendingPriorityResponsesCount;
                  }
               }
            } catch (IOException var12) {
               this.js5Error(-3);
            }

         }
      }
   }

   @ObfuscatedName("gq")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1264077438"
   )
   @Export("js5Error")
   void js5Error(int var1) {
      class357.js5SocketTask = null;
      WorldMapIcon_1.js5Socket = null;
      js5ConnectState = 0;
      if (class31.currentPort == ClanChannel.worldPort) {
         class31.currentPort = class137.js5Port;
      } else {
         class31.currentPort = ClanChannel.worldPort;
      }

      ++js5Errors;
      if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
         if (gameState <= 5) {
            this.error("js5connect_full");
            class140.updateGameState(1000);
         } else {
            field537 = 3000;
         }
      } else if (js5Errors >= 2 && var1 == 6) {
         this.error("js5connect_outofdate");
         class140.updateGameState(1000);
      } else if (js5Errors >= 4) {
         if (gameState <= 5) {
            this.error("js5connect");
            class140.updateGameState(1000);
         } else {
            field537 = 3000;
         }
      }

   }

   @ObfuscatedName("gm")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "25"
   )
   @Export("doCycleLoggedOut")
   final void doCycleLoggedOut() {
      Object var1 = packetWriter.getSocket();
      PacketBuffer var2 = packetWriter.packetBuffer;

      try {
         if (loginState == 0) {
            if (class34.secureRandom == null && (secureRandomFuture.isDone() || field648 > 250)) {
               class34.secureRandom = secureRandomFuture.get();
               secureRandomFuture.shutdown();
               secureRandomFuture = null;
            }

            if (class34.secureRandom != null) {
               if (var1 != null) {
                  ((AbstractSocket)var1).close();
                  var1 = null;
               }

               class19.socketTask = null;
               hadNetworkError = false;
               field648 = 0;
               if (field640.method8841()) {
                  try {
                     this.method1655(EnumComposition.field2006);
                     class37.method709(21);
                  } catch (Throwable var25) {
                     class132.RunException_sendStackTrace((String)null, var25);
                     class32.getLoginError(65);
                     return;
                  }
               } else {
                  class37.method709(1);
               }
            }
         }

         class21 var28;
         if (loginState == 21) {
            if (this.field623 != null) {
               if (!this.field623.isDone()) {
                  return;
               }

               if (this.field623.isCancelled()) {
                  class32.getLoginError(65);
                  this.field623 = null;
                  return;
               }

               try {
                  RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.field623.get();
                  if (!var3.isSuccess()) {
                     class32.getLoginError(65);
                     this.field623 = null;
                     return;
                  }

                  class146.field1717 = var3.getAccessToken();
                  EnumComposition.field2006 = var3.getRefreshToken();
                  this.field623 = null;
               } catch (Exception var24) {
                  class132.RunException_sendStackTrace((String)null, var24);
                  class32.getLoginError(65);
                  this.field623 = null;
                  return;
               }
            } else {
               if (this.field654 == null) {
                  class32.getLoginError(65);
                  return;
               }

               if (!this.field654.method279()) {
                  return;
               }

               if (this.field654.method281()) {
                  class132.RunException_sendStackTrace(this.field654.method275(), (Throwable)null);
                  class32.getLoginError(65);
                  this.field654 = null;
                  return;
               }

               var28 = this.field654.method286();
               if (var28.method297() != 200) {
                  class32.getLoginError(65);
                  this.field654 = null;
                  return;
               }

               field648 = 0;
               class422 var4 = new class422(var28.method298());

               try {
                  class146.field1717 = var4.method7917().getString("access_token");
                  EnumComposition.field2006 = var4.method7917().getString("refresh_token");
               } catch (Exception var23) {
                  class132.RunException_sendStackTrace("Error parsing tokens", var23);
                  class32.getLoginError(65);
                  this.field654 = null;
                  return;
               }
            }

            this.method1233(class146.field1717);
            class37.method709(20);
         }

         if (loginState == 20) {
            if (this.field549 != null) {
               if (!this.field549.isDone()) {
                  return;
               }

               if (this.field549.isCancelled()) {
                  class32.getLoginError(65);
                  this.field549 = null;
                  return;
               }

               try {
                  OtlTokenResponse var29 = (OtlTokenResponse)this.field549.get();
                  if (!var29.isSuccess()) {
                     class32.getLoginError(65);
                     this.field549 = null;
                     return;
                  }

                  this.field781 = var29.getToken();
                  this.field549 = null;
               } catch (Exception var22) {
                  class132.RunException_sendStackTrace((String)null, var22);
                  class32.getLoginError(65);
                  this.field549 = null;
                  return;
               }
            } else {
               if (this.field547 == null) {
                  class32.getLoginError(65);
                  return;
               }

               if (!this.field547.method279()) {
                  return;
               }

               if (this.field547.method281()) {
                  class132.RunException_sendStackTrace(this.field547.method275(), (Throwable)null);
                  class32.getLoginError(65);
                  this.field547 = null;
                  return;
               }

               var28 = this.field547.method286();
               if (var28.method297() != 200) {
                  class132.RunException_sendStackTrace("Response code: " + var28.method297() + "Response body: " + var28.method298(), (Throwable)null);
                  class32.getLoginError(65);
                  this.field547 = null;
                  return;
               }

               this.field781 = var28.method298();
               this.field547 = null;
            }

            field648 = 0;
            class37.method709(1);
         }

         if (loginState == 1) {
            if (class19.socketTask == null) {
               class19.socketTask = class242.taskHandler.newSocketTask(class139.worldHost, class31.currentPort);
            }

            if (class19.socketTask.status == 2) {
               throw new IOException();
            }

            if (class19.socketTask.status == 1) {
               Socket var30 = (Socket)class19.socketTask.result;
               BufferedNetSocket var31 = new BufferedNetSocket(var30, 40000, 5000);
               var1 = var31;
               packetWriter.setSocket(var31);
               class19.socketTask = null;
               class37.method709(2);
            }
         }

         PacketBufferNode var32;
         if (loginState == 2) {
            packetWriter.clearBuffer();
            var32 = class109.method2781();
            var32.clientPacket = null;
            var32.clientPacketLength = 0;
            var32.packetBuffer = new PacketBuffer(5000);
            var32.packetBuffer.writeByte(LoginPacket.field3300.id);
            packetWriter.addNode(var32);
            packetWriter.flush();
            var2.offset = 0;
            class37.method709(3);
         }

         int var15;
         if (loginState == 3) {
            if (TileItem.pcmPlayer0 != null) {
               TileItem.pcmPlayer0.method817();
            }

            if (UserComparator8.pcmPlayer1 != null) {
               UserComparator8.pcmPlayer1.method817();
            }

            if (((AbstractSocket)var1).isAvailable(1)) {
               var15 = ((AbstractSocket)var1).readUnsignedByte();
               if (TileItem.pcmPlayer0 != null) {
                  TileItem.pcmPlayer0.method817();
               }

               if (UserComparator8.pcmPlayer1 != null) {
                  UserComparator8.pcmPlayer1.method817();
               }

               if (var15 != 0) {
                  class32.getLoginError(var15);
                  return;
               }

               var2.offset = 0;
               class37.method709(4);
            }
         }

         if (loginState == 4) {
            if (var2.offset < 8) {
               var15 = ((AbstractSocket)var1).available();
               if (var15 > 8 - var2.offset) {
                  var15 = 8 - var2.offset;
               }

               if (var15 > 0) {
                  ((AbstractSocket)var1).read(var2.array, var2.offset, var15);
                  var2.offset += var15;
               }
            }

            if (var2.offset == 8) {
               var2.offset = 0;
               VerticalAlignment.field2075 = var2.readLong();
               class37.method709(5);
            }
         }

         if (loginState == 5) {
            packetWriter.packetBuffer.offset = 0;
            packetWriter.clearBuffer();
            PacketBuffer var33 = new PacketBuffer(500);
            int[] var34 = new int[]{class34.secureRandom.nextInt(), class34.secureRandom.nextInt(), class34.secureRandom.nextInt(), class34.secureRandom.nextInt()};
            var33.offset = 0;
            var33.writeByte(1);
            var33.writeInt(var34[0]);
            var33.writeInt(var34[1]);
            var33.writeInt(var34[2]);
            var33.writeInt(var34[3]);
            var33.writeLong(VerticalAlignment.field2075);
            if (gameState == 40) {
               var33.writeInt(WorldMapEvent.field3020[0]);
               var33.writeInt(WorldMapEvent.field3020[1]);
               var33.writeInt(WorldMapEvent.field3020[2]);
               var33.writeInt(WorldMapEvent.field3020[3]);
            } else {
               if (gameState == 50) {
                  var33.writeByte(class132.field1628.rsOrdinal());
                  var33.writeInt(class29.field172);
               } else {
                  var33.writeByte(field540.rsOrdinal());
                  switch (field540.field1627) {
                     case 0:
                        var33.offset += 4;
                     case 1:
                     default:
                        break;
                     case 2:
                        var33.writeInt(StructComposition.clientPreferences.method2437(Login.Login_username));
                        break;
                     case 3:
                     case 4:
                        var33.writeMedium(class143.field1697);
                        ++var33.offset;
                  }
               }

               if (field640.method8841()) {
                  var33.writeByte(class471.field4969.rsOrdinal());
                  var33.writeStringCp1252NullTerminated(this.field781);
               } else {
                  var33.writeByte(class471.field4976.rsOrdinal());
                  var33.writeStringCp1252NullTerminated(Login.Login_password);
               }
            }

            var33.encryptRsa(class71.field911, class71.field908);
            WorldMapEvent.field3020 = var34;
            PacketBufferNode var6 = class109.method2781();
            var6.clientPacket = null;
            var6.clientPacketLength = 0;
            var6.packetBuffer = new PacketBuffer(5000);
            var6.packetBuffer.offset = 0;
            if (gameState == 40) {
               var6.packetBuffer.writeByte(LoginPacket.field3303.id);
            } else {
               var6.packetBuffer.writeByte(LoginPacket.field3301.id);
            }

            var6.packetBuffer.writeShort(0);
            int var7 = var6.packetBuffer.offset;
            var6.packetBuffer.writeInt(210);
            var6.packetBuffer.writeInt(1);
            var6.packetBuffer.writeByte(clientType);
            var6.packetBuffer.writeByte(field698);
            byte var8 = 0;
            var6.packetBuffer.writeByte(var8);
            var6.packetBuffer.writeBytes(var33.array, 0, var33.offset);
            int var9 = var6.packetBuffer.offset;
            var6.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
            var6.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
            var6.packetBuffer.writeShort(CollisionMap.canvasWidth);
            var6.packetBuffer.writeShort(Language.canvasHeight);
            PacketBuffer var10 = var6.packetBuffer;
            int var13;
            if (randomDatData != null) {
               var10.writeBytes(randomDatData, 0, randomDatData.length);
            } else {
               byte[] var12 = new byte[24];

               try {
                  JagexCache.JagexCache_randomDat.seek(0L);
                  JagexCache.JagexCache_randomDat.readFully(var12);

                  for(var13 = 0; var13 < 24 && var12[var13] == 0; ++var13) {
                  }

                  if (var13 >= 24) {
                     throw new IOException();
                  }
               } catch (Exception var26) {
                  for(int var14 = 0; var14 < 24; ++var14) {
                     var12[var14] = -1;
                  }
               }

               var10.writeBytes(var12, 0, var12.length);
            }

            var6.packetBuffer.writeStringCp1252NullTerminated(class133.field1635);
            var6.packetBuffer.writeInt(WallDecoration.field2799);
            Buffer var11 = new Buffer(class213.platformInfo.size());
            class213.platformInfo.write(var11);
            var6.packetBuffer.writeBytes(var11.array, 0, var11.array.length);
            var6.packetBuffer.writeByte(clientType);
            var6.packetBuffer.writeInt(0);
            var6.packetBuffer.writeInt(FloorUnderlayDefinition.archive4.hash);
            var6.packetBuffer.writeIntIME(class71.archive12.hash);
            var6.packetBuffer.writeIntIME(VerticalAlignment.archive17.hash);
            var6.packetBuffer.writeIntLE(class89.archive15.hash);
            var6.packetBuffer.writeIntIME(VarpDefinition.archive14.hash);
            var6.packetBuffer.writeIntLE(HitSplatDefinition.archive2.hash);
            var6.packetBuffer.writeIntIME(0);
            var6.packetBuffer.writeIntME(ClientPreferences.archive8.hash);
            var6.packetBuffer.writeIntLE(class162.archive6.hash);
            var6.packetBuffer.writeInt(class358.archive13.hash);
            var6.packetBuffer.writeIntIME(class170.archive18.hash);
            var6.packetBuffer.writeInt(Frames.field2615.hash);
            var6.packetBuffer.writeIntME(class301.archive11.hash);
            var6.packetBuffer.writeInt(class9.archive7.hash);
            var6.packetBuffer.writeInt(FontName.archive19.hash);
            var6.packetBuffer.writeIntME(WorldMapArea.archive20.hash);
            var6.packetBuffer.writeInt(class21.field123.hash);
            var6.packetBuffer.writeIntLE(ClanChannelMember.archive10.hash);
            var6.packetBuffer.writeIntLE(class4.archive9.hash);
            var6.packetBuffer.writeInt(WorldMapSection0.field2932.hash);
            var6.packetBuffer.writeIntME(HealthBar.field1306.hash);
            var6.packetBuffer.xteaEncrypt(var34, var9, var6.packetBuffer.offset);
            var6.packetBuffer.writeLengthShort(var6.packetBuffer.offset - var7);
            packetWriter.addNode(var6);
            packetWriter.flush();
            packetWriter.isaacCipher = new IsaacCipher(var34);
            int[] var41 = new int[4];

            for(var13 = 0; var13 < 4; ++var13) {
               var41[var13] = var34[var13] + 50;
            }

            var2.newIsaacCipher(var41);
            class37.method709(6);
         }

         int var17;
         if (loginState == 6 && ((AbstractSocket)var1).available() > 0) {
            var15 = ((AbstractSocket)var1).readUnsignedByte();
            if (var15 == 61) {
               var17 = ((AbstractSocket)var1).available();
               class155.field1785 = var17 == 1 && ((AbstractSocket)var1).readUnsignedByte() == 1;
               class37.method709(5);
            }

            if (var15 == 21 && gameState == 20) {
               class37.method709(12);
            } else if (var15 == 2) {
               class37.method709(14);
            } else if (var15 == 15 && gameState == 40) {
               packetWriter.serverPacketLength = -1;
               class37.method709(19);
            } else if (var15 == 64) {
               class37.method709(10);
            } else if (var15 == 23 && field541 < 1) {
               ++field541;
               class37.method709(0);
            } else if (var15 == 29) {
               class37.method709(17);
            } else {
               if (var15 != 69) {
                  class32.getLoginError(var15);
                  return;
               }

               class37.method709(7);
            }
         }

         if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) {
            ((AbstractSocket)var1).read(var2.array, 0, 2);
            var2.offset = 0;
            UserComparator8.field1461 = var2.readUnsignedShort();
            class37.method709(8);
         }

         if (loginState == 8 && ((AbstractSocket)var1).available() >= UserComparator8.field1461) {
            var2.offset = 0;
            ((AbstractSocket)var1).read(var2.array, var2.offset, UserComparator8.field1461);
            class6 var35 = Skills.method6369()[var2.readUnsignedByte()];

            try {
               class3 var36 = NetCache.method6566(var35);
               this.field573 = new class7(var2, var36);
               class37.method709(9);
            } catch (Exception var21) {
               class32.getLoginError(22);
               return;
            }
         }

         if (loginState == 9 && this.field573.method57()) {
            this.field557 = this.field573.method56();
            this.field573.method45();
            this.field573 = null;
            if (this.field557 == null) {
               class32.getLoginError(22);
               return;
            }

            packetWriter.clearBuffer();
            var32 = class109.method2781();
            var32.clientPacket = null;
            var32.clientPacketLength = 0;
            var32.packetBuffer = new PacketBuffer(5000);
            var32.packetBuffer.writeByte(LoginPacket.field3304.id);
            var32.packetBuffer.writeShort(this.field557.offset);
            var32.packetBuffer.writeBuffer(this.field557);
            packetWriter.addNode(var32);
            packetWriter.flush();
            this.field557 = null;
            class37.method709(6);
         }

         if (loginState == 10 && ((AbstractSocket)var1).available() > 0) {
            TextureProvider.field2643 = ((AbstractSocket)var1).readUnsignedByte();
            class37.method709(11);
         }

         if (loginState == 11 && ((AbstractSocket)var1).available() >= TextureProvider.field2643) {
            ((AbstractSocket)var1).read(var2.array, 0, TextureProvider.field2643);
            var2.offset = 0;
            class37.method709(6);
         }

         if (loginState == 12 && ((AbstractSocket)var1).available() > 0) {
            field527 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
            class37.method709(13);
         }

         if (loginState == 13) {
            field648 = 0;
            TaskHandler.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field527 / 60 + " seconds.");
            if (--field527 <= 0) {
               class37.method709(0);
            }

         } else {
            if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) {
               class420.field4655 = ((AbstractSocket)var1).readUnsignedByte();
               class37.method709(15);
            }

            if (loginState == 15 && ((AbstractSocket)var1).available() >= class420.field4655) {
               boolean var42 = ((AbstractSocket)var1).readUnsignedByte() == 1;
               ((AbstractSocket)var1).read(var2.array, 0, 4);
               var2.offset = 0;
               boolean var43 = false;
               if (var42) {
                  var17 = var2.readByteIsaac() << 24;
                  var17 |= var2.readByteIsaac() << 16;
                  var17 |= var2.readByteIsaac() << 8;
                  var17 |= var2.readByteIsaac();
                  StructComposition.clientPreferences.method2435(Login.Login_username, var17);
               }

               if (Login_isUsernameRemembered) {
                  StructComposition.clientPreferences.method2429(Login.Login_username);
               } else {
                  StructComposition.clientPreferences.method2429((String)null);
               }

               Tile.savePreferences();
               staffModLevel = ((AbstractSocket)var1).readUnsignedByte();
               playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1;
               localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
               localPlayerIndex <<= 8;
               localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte();
               field692 = ((AbstractSocket)var1).readUnsignedByte();
               ((AbstractSocket)var1).read(var2.array, 0, 8);
               var2.offset = 0;
               this.field559 = var2.readLong();
               if (class420.field4655 >= 29) {
                  ((AbstractSocket)var1).read(var2.array, 0, 8);
                  var2.offset = 0;
                  field637 = var2.readLong();
               }

               ((AbstractSocket)var1).read(var2.array, 0, 1);
               var2.offset = 0;
               ServerPacket[] var5 = EnumComposition.ServerPacket_values();
               int var18 = var2.readSmartByteShortIsaac();
               if (var18 < 0 || var18 >= var5.length) {
                  throw new IOException(var18 + " " + var2.offset);
               }

               packetWriter.serverPacket = var5[var18];
               packetWriter.serverPacketLength = packetWriter.serverPacket.length;
               ((AbstractSocket)var1).read(var2.array, 0, 2);
               var2.offset = 0;
               packetWriter.serverPacketLength = var2.readUnsignedShort();

               try {
                  class27.method390(BuddyRankComparator.client, "zap");
               } catch (Throwable var20) {
               }

               class37.method709(16);
            }

            if (loginState == 16) {
               if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
                  var2.offset = 0;
                  ((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
                  timer.method7332();
                  class104.method2650();
                  class280.updatePlayer(var2);
                  class17.field101 = -1;
                  InterfaceParent.loadRegions(false, var2);
                  packetWriter.serverPacket = null;
               }

            } else {
               if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) {
                  var2.offset = 0;
                  ((AbstractSocket)var1).read(var2.array, 0, 2);
                  var2.offset = 0;
                  class155.field1788 = var2.readUnsignedShort();
                  class37.method709(18);
               }

               if (loginState == 18 && ((AbstractSocket)var1).available() >= class155.field1788) {
                  var2.offset = 0;
                  ((AbstractSocket)var1).read(var2.array, 0, class155.field1788);
                  var2.offset = 0;
                  String var37 = var2.readStringCp1252NullTerminated();
                  String var40 = var2.readStringCp1252NullTerminated();
                  String var38 = var2.readStringCp1252NullTerminated();
                  TaskHandler.setLoginResponseString(var37, var40, var38);
                  class140.updateGameState(10);
                  if (field640.method8841()) {
                     class12.method155(9);
                  }
               }

               if (loginState != 19) {
                  ++field648;
                  if (field648 > 2000) {
                     if (field541 < 1) {
                        if (ClanChannel.worldPort == class31.currentPort) {
                           class31.currentPort = class137.js5Port;
                        } else {
                           class31.currentPort = ClanChannel.worldPort;
                        }

                        ++field541;
                        class37.method709(0);
                     } else {
                        class32.getLoginError(-3);
                     }
                  }
               } else {
                  if (packetWriter.serverPacketLength == -1) {
                     if (((AbstractSocket)var1).available() < 2) {
                        return;
                     }

                     ((AbstractSocket)var1).read(var2.array, 0, 2);
                     var2.offset = 0;
                     packetWriter.serverPacketLength = var2.readUnsignedShort();
                  }

                  if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
                     ((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
                     var2.offset = 0;
                     var15 = packetWriter.serverPacketLength;
                     timer.method7328();
                     packetWriter.clearBuffer();
                     packetWriter.packetBuffer.offset = 0;
                     packetWriter.serverPacket = null;
                     packetWriter.field1431 = null;
                     packetWriter.field1432 = null;
                     packetWriter.field1433 = null;
                     packetWriter.serverPacketLength = 0;
                     packetWriter.field1420 = 0;
                     rebootTimer = 0;
                     WorldMapSectionType.method5230();
                     minimapState = 0;
                     destinationX = 0;

                     for(var17 = 0; var17 < 2048; ++var17) {
                        players[var17] = null;
                     }

                     class155.localPlayer = null;

                     for(var17 = 0; var17 < npcs.length; ++var17) {
                        NPC var39 = npcs[var17];
                        if (var39 != null) {
                           var39.targetIndex = -1;
                           var39.false0 = false;
                        }
                     }

                     class32.method459();
                     class140.updateGameState(30);

                     for(var17 = 0; var17 < 100; ++var17) {
                        field731[var17] = true;
                     }

                     var32 = class136.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, packetWriter.isaacCipher);
                     var32.packetBuffer.writeByte(Message.getWindowedMode());
                     var32.packetBuffer.writeShort(CollisionMap.canvasWidth);
                     var32.packetBuffer.writeShort(Language.canvasHeight);
                     packetWriter.addNode(var32);
                     class280.updatePlayer(var2);
                     if (var15 != var2.offset) {
                        throw new RuntimeException();
                     }
                  }
               }
            }
         }
      } catch (IOException var27) {
         if (field541 < 1) {
            if (class31.currentPort == ClanChannel.worldPort) {
               class31.currentPort = class137.js5Port;
            } else {
               class31.currentPort = ClanChannel.worldPort;
            }

            ++field541;
            class37.method709(0);
         } else {
            class32.getLoginError(-2);
         }
      }
   }

   @ObfuscatedName("gg")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-35306056"
   )
   @Export("doCycleLoggedIn")
   final void doCycleLoggedIn() {
      if (rebootTimer > 1) {
         --rebootTimer;
      }

      if (logoutTimer > 0) {
         --logoutTimer;
      }

      if (hadNetworkError) {
         hadNetworkError = false;
         FaceNormal.method4619();
      } else {
         if (!isMenuOpen) {
            FriendsChat.addCancelMenuEntry();
         }

         int var1;
         for(var1 = 0; var1 < 100 && this.method1727(packetWriter); ++var1) {
         }

         if (gameState == 30) {
            while(true) {
               ReflectionCheck var2 = (ReflectionCheck)class37.reflectionChecks.last();
               boolean var29;
               if (var2 == null) {
                  var29 = false;
               } else {
                  var29 = true;
               }

               int var3;
               PacketBufferNode var30;
               if (!var29) {
                  PacketBufferNode var14;
                  int var15;
                  if (timer.field4452) {
                     var14 = class136.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS, packetWriter.isaacCipher);
                     var14.packetBuffer.writeByte(0);
                     var15 = var14.packetBuffer.offset;
                     timer.write(var14.packetBuffer);
                     var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var15);
                     packetWriter.addNode(var14);
                     timer.method7333();
                  }

                  int var4;
                  int var5;
                  int var6;
                  int var7;
                  int var8;
                  int var9;
                  int var10;
                  int var11;
                  synchronized(class271.mouseRecorder.lock) {
                     if (!field674) {
                        class271.mouseRecorder.index = 0;
                     } else if (MouseHandler.MouseHandler_lastButton != 0 || class271.mouseRecorder.index >= 40) {
                        var30 = null;
                        var3 = 0;
                        var4 = 0;
                        var5 = 0;
                        var6 = 0;

                        for(var7 = 0; var7 < class271.mouseRecorder.index && (var30 == null || var30.packetBuffer.offset - var3 < 246); ++var7) {
                           var4 = var7;
                           var8 = class271.mouseRecorder.ys[var7];
                           if (var8 < -1) {
                              var8 = -1;
                           } else if (var8 > 65534) {
                              var8 = 65534;
                           }

                           var9 = class271.mouseRecorder.xs[var7];
                           if (var9 < -1) {
                              var9 = -1;
                           } else if (var9 > 65534) {
                              var9 = 65534;
                           }

                           if (var9 != field520 || var8 != field552) {
                              if (var30 == null) {
                                 var30 = class136.getPacketBufferNode(ClientPacket.field3121, packetWriter.isaacCipher);
                                 var30.packetBuffer.writeByte(0);
                                 var3 = var30.packetBuffer.offset;
                                 PacketBuffer var10000 = var30.packetBuffer;
                                 var10000.offset += 2;
                                 var5 = 0;
                                 var6 = 0;
                              }

                              int var12;
                              if (field522 != -1L) {
                                 var10 = var9 - field520;
                                 var11 = var8 - field552;
                                 var12 = (int)((class271.mouseRecorder.millis[var7] - field522) / 20L);
                                 var5 = (int)((long)var5 + (class271.mouseRecorder.millis[var7] - field522) % 20L);
                              } else {
                                 var10 = var9;
                                 var11 = var8;
                                 var12 = Integer.MAX_VALUE;
                              }

                              field520 = var9;
                              field552 = var8;
                              if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                 var10 += 32;
                                 var11 += 32;
                                 var30.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
                              } else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
                                 var10 += 128;
                                 var11 += 128;
                                 var30.packetBuffer.writeByte(var12 + 128);
                                 var30.packetBuffer.writeShort(var11 + (var10 << 8));
                              } else if (var12 < 32) {
                                 var30.packetBuffer.writeByte(var12 + 192);
                                 if (var9 != -1 && var8 != -1) {
                                    var30.packetBuffer.writeInt(var9 | var8 << 16);
                                 } else {
                                    var30.packetBuffer.writeInt(Integer.MIN_VALUE);
                                 }
                              } else {
                                 var30.packetBuffer.writeShort((var12 & 8191) + '\ue000');
                                 if (var9 != -1 && var8 != -1) {
                                    var30.packetBuffer.writeInt(var9 | var8 << 16);
                                 } else {
                                    var30.packetBuffer.writeInt(Integer.MIN_VALUE);
                                 }
                              }

                              ++var6;
                              field522 = class271.mouseRecorder.millis[var7];
                           }
                        }

                        if (var30 != null) {
                           var30.packetBuffer.writeLengthByte(var30.packetBuffer.offset - var3);
                           var7 = var30.packetBuffer.offset;
                           var30.packetBuffer.offset = var3;
                           var30.packetBuffer.writeByte(var5 / var6);
                           var30.packetBuffer.writeByte(var5 % var6);
                           var30.packetBuffer.offset = var7;
                           packetWriter.addNode(var30);
                        }

                        if (var4 >= class271.mouseRecorder.index) {
                           class271.mouseRecorder.index = 0;
                        } else {
                           MouseRecorder var49 = class271.mouseRecorder;
                           var49.index -= var4;
                           System.arraycopy(class271.mouseRecorder.xs, var4, class271.mouseRecorder.xs, 0, class271.mouseRecorder.index);
                           System.arraycopy(class271.mouseRecorder.ys, var4, class271.mouseRecorder.ys, 0, class271.mouseRecorder.index);
                           System.arraycopy(class271.mouseRecorder.millis, var4, class271.mouseRecorder.millis, 0, class271.mouseRecorder.index);
                        }
                     }
                  }

                  PacketBufferNode var18;
                  if (MouseHandler.MouseHandler_lastButton == 1 || !SceneTilePaint.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
                     long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L;
                     if (var16 > 32767L) {
                        var16 = 32767L;
                     }

                     mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L;
                     var3 = MouseHandler.MouseHandler_lastPressedY;
                     if (var3 < 0) {
                        var3 = 0;
                     } else if (var3 > Language.canvasHeight) {
                        var3 = Language.canvasHeight;
                     }

                     var4 = MouseHandler.MouseHandler_lastPressedX;
                     if (var4 < 0) {
                        var4 = 0;
                     } else if (var4 > CollisionMap.canvasWidth) {
                        var4 = CollisionMap.canvasWidth;
                     }

                     var5 = (int)var16;
                     var18 = class136.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, packetWriter.isaacCipher);
                     var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
                     var18.packetBuffer.writeShort(var4);
                     var18.packetBuffer.writeShort(var3);
                     packetWriter.addNode(var18);
                  }

                  if (field747.field2326 > 0) {
                     var14 = class136.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, packetWriter.isaacCipher);
                     var14.packetBuffer.writeShort(0);
                     var15 = var14.packetBuffer.offset;
                     long var19 = Message.method1197();

                     for(var5 = 0; var5 < field747.field2326; ++var5) {
                        long var21 = var19 - field679;
                        if (var21 > 16777215L) {
                           var21 = 16777215L;
                        }

                        field679 = var19;
                        var14.packetBuffer.writeMedium((int)var21);
                        var14.packetBuffer.writeByte(field747.field2323[var5]);
                     }

                     var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15);
                     packetWriter.addNode(var14);
                  }

                  if (field807 > 0) {
                     --field807;
                  }

                  if (field747.method4106(96) || field747.method4106(97) || field747.method4106(98) || field747.method4106(99)) {
                     field603 = true;
                  }

                  if (field603 && field807 <= 0) {
                     field807 = 20;
                     field603 = false;
                     var14 = class136.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION, packetWriter.isaacCipher);
                     var14.packetBuffer.writeShort(camAngleY);
                     var14.packetBuffer.writeShort(camAngleX);
                     packetWriter.addNode(var14);
                  }

                  if (PacketBuffer.hasFocus && !hadFocus) {
                     hadFocus = true;
                     var14 = class136.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
                     var14.packetBuffer.writeByte(1);
                     packetWriter.addNode(var14);
                  }

                  if (!PacketBuffer.hasFocus && hadFocus) {
                     hadFocus = false;
                     var14 = class136.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
                     var14.packetBuffer.writeByte(0);
                     packetWriter.addNode(var14);
                  }

                  if (KitDefinition.worldMap != null) {
                     KitDefinition.worldMap.method7989();
                  }

                  if (class281.ClanChat_inClanChat) {
                     if (class281.friendsChat != null) {
                        class281.friendsChat.sort();
                     }

                     class169.method3484();
                     class281.ClanChat_inClanChat = false;
                  }

                  class29.method429();
                  class253.method5283();
                  if (gameState != 30) {
                     return;
                  }

                  for(PendingSpawn var35 = (PendingSpawn)pendingSpawns.last(); var35 != null; var35 = (PendingSpawn)pendingSpawns.previous()) {
                     if (var35.hitpoints > 0) {
                        --var35.hitpoints;
                     }

                     if (var35.hitpoints == 0) {
                        if (var35.objectId >= 0) {
                           var3 = var35.objectId;
                           var4 = var35.field1166;
                           ObjectComposition var23 = VarpDefinition.getObjectDefinition(var3);
                           if (var4 == 11) {
                              var4 = 10;
                           }

                           if (var4 >= 5 && var4 <= 8) {
                              var4 = 4;
                           }

                           boolean var36 = var23.method3867(var4);
                           if (!var36) {
                              continue;
                           }
                        }

                        BuddyRankComparator.addPendingSpawnToScene(var35.plane, var35.type, var35.x, var35.y, var35.objectId, var35.field1175, var35.field1166);
                        var35.remove();
                     } else {
                        if (var35.delay > 0) {
                           --var35.delay;
                        }

                        if (var35.delay == 0 && var35.x >= 1 && var35.y >= 1 && var35.x <= 102 && var35.y <= 102 && (var35.field1167 < 0 || Archive.method6426(var35.field1167, var35.field1169))) {
                           BuddyRankComparator.addPendingSpawnToScene(var35.plane, var35.type, var35.x, var35.y, var35.field1167, var35.field1168, var35.field1169);
                           var35.delay = -1;
                           if (var35.objectId == var35.field1167 && var35.objectId == -1) {
                              var35.remove();
                           } else if (var35.field1167 == var35.objectId && var35.field1168 == var35.field1175 && var35.field1166 == var35.field1169) {
                              var35.remove();
                           }
                        }
                     }
                  }

                  class130.method3029();
                  ++packetWriter.field1420;
                  if (packetWriter.field1420 > 750) {
                     FaceNormal.method4619();
                     return;
                  }

                  HitSplatDefinition.method3860();

                  for(var1 = 0; var1 < npcCount; ++var1) {
                     var15 = npcIndices[var1];
                     NPC var24 = npcs[var15];
                     if (var24 != null) {
                        FloorDecoration.updateActorSequence(var24, var24.definition.size);
                     }
                  }

                  int[] var37 = Players.Players_indices;

                  for(var15 = 0; var15 < Players.Players_count; ++var15) {
                     Player var41 = players[var37[var15]];
                     if (var41 != null && var41.overheadTextCyclesRemaining > 0) {
                        --var41.overheadTextCyclesRemaining;
                        if (var41.overheadTextCyclesRemaining == 0) {
                           var41.overheadText = null;
                        }
                     }
                  }

                  for(var15 = 0; var15 < npcCount; ++var15) {
                     var3 = npcIndices[var15];
                     NPC var25 = npcs[var3];
                     if (var25 != null && var25.overheadTextCyclesRemaining > 0) {
                        --var25.overheadTextCyclesRemaining;
                        if (var25.overheadTextCyclesRemaining == 0) {
                           var25.overheadText = null;
                        }
                     }
                  }

                  ++graphicsCycle;
                  if (mouseCrossColor != 0) {
                     mouseCrossState = mouseCrossState * 400 + 20;
                     if (mouseCrossState * 400 >= 400) {
                        mouseCrossColor = 0;
                     }
                  }

                  if (MusicPatchPcmStream.field3411 != null) {
                     ++field624;
                     if (field624 >= 15) {
                        class69.invalidateWidget(MusicPatchPcmStream.field3411);
                        MusicPatchPcmStream.field3411 = null;
                     }
                  }

                  Widget var38 = WorldMapScaleHandler.mousedOverWidgetIf1;
                  Widget var31 = class380.field4470;
                  WorldMapScaleHandler.mousedOverWidgetIf1 = null;
                  class380.field4470 = null;
                  draggedOnWidget = null;
                  field701 = false;
                  field745 = false;
                  field710 = 0;

                  while(field747.method4114() && field710 < 128) {
                     if (staffModLevel >= 2 && field747.method4106(82) && field747.field2328 == 66) {
                        String var43 = LoginScreenAnimation.method2390();
                        BuddyRankComparator.client.method497(var43);
                     } else if (oculusOrbState != 1 || field747.field2315 <= 0) {
                        field751[field710] = field747.field2328;
                        field774[field710] = field747.field2315;
                        ++field710;
                     }
                  }

                  if (TaskHandler.method3443() && field747.method4106(82) && field747.method4106(81) && mouseWheelRotation != 0) {
                     var3 = class155.localPlayer.plane - mouseWheelRotation;
                     if (var3 < 0) {
                        var3 = 0;
                     } else if (var3 > 3) {
                        var3 = 3;
                     }

                     if (var3 != class155.localPlayer.plane) {
                        var4 = class155.localPlayer.pathX[0] + class154.baseX * 64;
                        var5 = class155.localPlayer.pathY[0] + class365.baseY * 64;
                        var18 = class136.getPacketBufferNode(ClientPacket.field3120, packetWriter.isaacCipher);
                        var18.packetBuffer.writeShortLE(var5);
                        var18.packetBuffer.writeByteAdd(var3);
                        var18.packetBuffer.writeShortAdd(var4);
                        var18.packetBuffer.writeIntME(0);
                        packetWriter.addNode(var18);
                     }

                     mouseWheelRotation = 0;
                  }

                  if (MouseHandler.MouseHandler_lastButton == 1) {
                     field572.method4068();
                  }

                  if (rootInterface != -1) {
                     class378.updateRootInterface(rootInterface, 0, 0, CollisionMap.canvasWidth, Language.canvasHeight, 0, 0);
                  }

                  ++cycleCntr;

                  while(true) {
                     Widget var40;
                     ScriptEvent var44;
                     Widget var45;
                     do {
                        var44 = (ScriptEvent)field725.removeLast();
                        if (var44 == null) {
                           while(true) {
                              do {
                                 var44 = (ScriptEvent)field726.removeLast();
                                 if (var44 == null) {
                                    while(true) {
                                       do {
                                          var44 = (ScriptEvent)scriptEvents.removeLast();
                                          if (var44 == null) {
                                             while(true) {
                                                while(true) {
                                                   PacketBufferNode var26;
                                                   class200 var46;
                                                   do {
                                                      do {
                                                         do {
                                                            var46 = (class200)field727.removeLast();
                                                            if (var46 == null) {
                                                               this.menu();
                                                               if (KitDefinition.worldMap != null) {
                                                                  KitDefinition.worldMap.method7999(class383.Client_plane, class154.baseX * 64 + (class155.localPlayer.x >> 7), class365.baseY * 64 + (class155.localPlayer.y >> 7), false);
                                                                  KitDefinition.worldMap.loadCache();
                                                               }

                                                               if (clickedWidget != null) {
                                                                  this.method1261();
                                                               }

                                                               if (class368.dragInventoryWidget != null) {
                                                                  class69.invalidateWidget(class368.dragInventoryWidget);
                                                                  ++itemDragDuration;
                                                                  if (MouseHandler.MouseHandler_currentButton == 0) {
                                                                     if (field630) {
                                                                        if (class368.dragInventoryWidget == WorldMapID.hoveredItemContainer && dragItemSlotDestination != dragItemSlotSource) {
                                                                           Widget var47 = class368.dragInventoryWidget;
                                                                           byte var34 = 0;
                                                                           if (field685 == 1 && var47.contentType == 206) {
                                                                              var34 = 1;
                                                                           }

                                                                           if (var47.itemIds[dragItemSlotDestination] <= 0) {
                                                                              var34 = 0;
                                                                           }

                                                                           var6 = Clock.getWidgetFlags(var47);
                                                                           boolean var33 = (var6 >> 29 & 1) != 0;
                                                                           if (var33) {
                                                                              var7 = dragItemSlotSource;
                                                                              var8 = dragItemSlotDestination;
                                                                              var47.itemIds[var8] = var47.itemIds[var7];
                                                                              var47.itemQuantities[var8] = var47.itemQuantities[var7];
                                                                              var47.itemIds[var7] = -1;
                                                                              var47.itemQuantities[var7] = 0;
                                                                           } else if (var34 == 1) {
                                                                              var7 = dragItemSlotSource;
                                                                              var8 = dragItemSlotDestination;

                                                                              while(var7 != var8) {
                                                                                 if (var7 > var8) {
                                                                                    var47.swapItems(var7 - 1, var7);
                                                                                    --var7;
                                                                                 } else if (var7 < var8) {
                                                                                    var47.swapItems(var7 + 1, var7);
                                                                                    ++var7;
                                                                                 }
                                                                              }
                                                                           } else {
                                                                              var47.swapItems(dragItemSlotDestination, dragItemSlotSource);
                                                                           }

                                                                           var26 = class136.getPacketBufferNode(ClientPacket.IF_BUTTOND, packetWriter.isaacCipher);
                                                                           var26.packetBuffer.writeIntME(class368.dragInventoryWidget.id);
                                                                           var26.packetBuffer.writeShortLE(dragItemSlotSource);
                                                                           var26.packetBuffer.writeShort(dragItemSlotDestination);
                                                                           var26.packetBuffer.writeByteSub(var34);
                                                                           packetWriter.addNode(var26);
                                                                        }
                                                                     } else if (this.shouldLeftClickOpenMenu()) {
                                                                        this.openMenu(draggedWidgetX, draggedWidgetY);
                                                                     } else if (menuOptionsCount > 0) {
                                                                        WorldMapLabelSize.method4861(draggedWidgetX, draggedWidgetY);
                                                                     }

                                                                     field624 = 10;
                                                                     MouseHandler.MouseHandler_lastButton = 0;
                                                                     class368.dragInventoryWidget = null;
                                                                  } else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) {
                                                                     field630 = true;
                                                                  }
                                                               }

                                                               if (Scene.shouldSendWalk()) {
                                                                  var3 = Scene.Scene_selectedX;
                                                                  var4 = Scene.Scene_selectedY;
                                                                  PacketBufferNode var42 = class136.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, packetWriter.isaacCipher);
                                                                  var42.packetBuffer.writeByte(5);
                                                                  var42.packetBuffer.writeByteSub(field747.method4106(82) ? (field747.method4106(81) ? 2 : 1) : 0);
                                                                  var42.packetBuffer.writeShortLE(class154.baseX * 64 + var3);
                                                                  var42.packetBuffer.writeShortAdd(class365.baseY * 64 + var4);
                                                                  packetWriter.addNode(var42);
                                                                  Scene.method4470();
                                                                  mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
                                                                  mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
                                                                  mouseCrossColor = 1;
                                                                  mouseCrossState = 0;
                                                                  destinationX = var3;
                                                                  destinationY = var4;
                                                               }

                                                               if (var38 != WorldMapScaleHandler.mousedOverWidgetIf1) {
                                                                  if (var38 != null) {
                                                                     class69.invalidateWidget(var38);
                                                                  }

                                                                  if (WorldMapScaleHandler.mousedOverWidgetIf1 != null) {
                                                                     class69.invalidateWidget(WorldMapScaleHandler.mousedOverWidgetIf1);
                                                                  }
                                                               }

                                                               if (var31 != class380.field4470 && field553 == field521) {
                                                                  if (var31 != null) {
                                                                     class69.invalidateWidget(var31);
                                                                  }

                                                                  if (class380.field4470 != null) {
                                                                     class69.invalidateWidget(class380.field4470);
                                                                  }
                                                               }

                                                               if (class380.field4470 != null) {
                                                                  if (field553 < field521) {
                                                                     ++field553;
                                                                     if (field521 == field553) {
                                                                        class69.invalidateWidget(class380.field4470);
                                                                     }
                                                                  }
                                                               } else if (field553 > 0) {
                                                                  --field553;
                                                               }

                                                               class9.method80();
                                                               if (field772) {
                                                                  class31.method453();
                                                               } else if (isCameraLocked) {
                                                                  var3 = class155.field1787 * 128 + 64;
                                                                  var4 = class34.field208 * 16384 + 64;
                                                                  var5 = SpotAnimationDefinition.getTileHeight(var3, var4, class383.Client_plane) - Script.field1001;
                                                                  class280.method5498(var3, var5, var4);
                                                                  var3 = class109.field1442 * 16384 + 64;
                                                                  var4 = class146.field1718 * 128 + 64;
                                                                  var5 = SpotAnimationDefinition.getTileHeight(var3, var4, class383.Client_plane) - class104.field1398;
                                                                  var6 = var3 - class145.cameraX;
                                                                  var7 = var5 - class414.cameraY;
                                                                  var8 = var4 - ClanChannel.cameraZ;
                                                                  var9 = (int)Math.sqrt((double)(var8 * var8 + var6 * var6));
                                                                  var10 = (int)(Math.atan2((double)var7, (double)var9) * 325.9490051269531) & 2047;
                                                                  var11 = (int)(Math.atan2((double)var6, (double)var8) * -325.9490051269531) & 2047;
                                                                  class158.method3335(var10, var11);
                                                               }

                                                               for(var3 = 0; var3 < 5; ++var3) {
                                                                  int var10002 = field617[var3]++;
                                                               }

                                                               WorldMapArea.varcs.tryWrite();
                                                               var3 = ++MouseHandler.MouseHandler_idleCycles - 1;
                                                               var5 = class168.method3482();
                                                               if (var3 > 15000 && var5 > 15000) {
                                                                  logoutTimer = 250;
                                                                  Player.method2333(14500);
                                                                  var18 = class136.getPacketBufferNode(ClientPacket.EVENT_MOUSE_IDLE, packetWriter.isaacCipher);
                                                                  packetWriter.addNode(var18);
                                                               }

                                                               DefaultsGroup.friendSystem.processFriendUpdates();
                                                               ++packetWriter.pendingWrites;
                                                               if (packetWriter.pendingWrites > 50) {
                                                                  var18 = class136.getPacketBufferNode(ClientPacket.NO_TIMEOUT, packetWriter.isaacCipher);
                                                                  packetWriter.addNode(var18);
                                                               }

                                                               try {
                                                                  packetWriter.flush();
                                                               } catch (IOException var27) {
                                                                  FaceNormal.method4619();
                                                               }

                                                               return;
                                                            }
                                                         } while(var46 == null);
                                                      } while(var46.field2312 == null);

                                                      if (var46.field2312.childIndex < 0) {
                                                         break;
                                                      }

                                                      var45 = PlayerCompositionColorTextureOverride.getWidget(var46.field2312.parentId);
                                                   } while(var45 == null || var45.children == null || var45.children.length == 0 || var46.field2312.childIndex >= var45.children.length || var46.field2312 != var45.children[var46.field2312.childIndex]);

                                                   if (var46.field2312.type == 11 && var46.field2307 == 0) {
                                                      switch (var46.field2312.method6174()) {
                                                         case 0:
                                                            ModeWhere.openURL(var46.field2312.method6177(), true, false);
                                                            break;
                                                         case 1:
                                                            var5 = Clock.getWidgetFlags(var46.field2312);
                                                            boolean var32 = (var5 >> 22 & 1) != 0;
                                                            if (var32) {
                                                               int[] var39 = var46.field2312.method6178();
                                                               if (var39 != null) {
                                                                  var26 = class136.getPacketBufferNode(ClientPacket.field3154, packetWriter.isaacCipher);
                                                                  var26.packetBuffer.writeIntLE(var39[2]);
                                                                  var26.packetBuffer.writeInt(var46.field2312.id);
                                                                  var26.packetBuffer.writeIntLE(var46.field2312.method6176());
                                                                  var26.packetBuffer.writeInt(var39[1]);
                                                                  var26.packetBuffer.writeShort(var46.field2312.childIndex);
                                                                  var26.packetBuffer.writeIntME(var39[0]);
                                                                  packetWriter.addNode(var26);
                                                               }
                                                            }
                                                      }
                                                   } else if (var46.field2312.type == 12) {
                                                      class303 var48 = var46.field2312.method6167();
                                                      if (var48 != null && var48.method5878()) {
                                                         switch (var46.field2307) {
                                                            case 0:
                                                               field572.method4066(var46.field2312);
                                                               var48.method5880(true);
                                                               var48.method5919(var46.field2311, var46.field2310, field747.method4106(82), field747.method4106(81));
                                                               break;
                                                            case 1:
                                                               var48.method6102(var46.field2311, var46.field2310);
                                                         }
                                                      }
                                                   }
                                                }
                                             }
                                          }

                                          var45 = var44.widget;
                                          if (var45.childIndex < 0) {
                                             break;
                                          }

                                          var40 = PlayerCompositionColorTextureOverride.getWidget(var45.parentId);
                                       } while(var40 == null || var40.children == null || var45.childIndex >= var40.children.length || var45 != var40.children[var45.childIndex]);

                                       WorldMapElement.runScriptEvent(var44);
                                    }
                                 }

                                 var45 = var44.widget;
                                 if (var45.childIndex < 0) {
                                    break;
                                 }

                                 var40 = PlayerCompositionColorTextureOverride.getWidget(var45.parentId);
                              } while(var40 == null || var40.children == null || var45.childIndex >= var40.children.length || var45 != var40.children[var45.childIndex]);

                              WorldMapElement.runScriptEvent(var44);
                           }
                        }

                        var45 = var44.widget;
                        if (var45.childIndex < 0) {
                           break;
                        }

                        var40 = PlayerCompositionColorTextureOverride.getWidget(var45.parentId);
                     } while(var40 == null || var40.children == null || var45.childIndex >= var40.children.length || var45 != var40.children[var45.childIndex]);

                     WorldMapElement.runScriptEvent(var44);
                  }
               }

               var30 = class136.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY, packetWriter.isaacCipher);
               var30.packetBuffer.writeByte(0);
               var3 = var30.packetBuffer.offset;
               ModelData0.performReflectionCheck(var30.packetBuffer);
               var30.packetBuffer.writeLengthByte(var30.packetBuffer.offset - var3);
               packetWriter.addNode(var30);
            }
         }
      }
   }

   @ObfuscatedName("hk")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1654731746"
   )
   @Export("resizeJS")
   void resizeJS() {
      int var1 = CollisionMap.canvasWidth;
      int var2 = Language.canvasHeight;
      if (super.contentWidth < var1) {
         var1 = super.contentWidth;
      }

      if (super.contentHeight < var2) {
         var2 = super.contentHeight;
      }

      if (StructComposition.clientPreferences != null) {
         try {
            Client var3 = BuddyRankComparator.client;
            Object[] var4 = new Object[]{Message.getWindowedMode()};
            JSObject.getWindow(var3).call("resize", var4);
         } catch (Throwable var5) {
         }
      }

   }

   @ObfuscatedName("hq")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-25398"
   )
   @Export("drawLoggedIn")
   final void drawLoggedIn() {
      int var1;
      if (rootInterface != -1) {
         var1 = rootInterface;
         if (Players.loadInterface(var1)) {
            UserComparator10.drawModelComponents(class71.Widget_interfaceComponents[var1], -1);
         }
      }

      for(var1 = 0; var1 < rootWidgetCount; ++var1) {
         if (field731[var1]) {
            field732[var1] = true;
         }

         field733[var1] = field731[var1];
         field731[var1] = false;
      }

      field808 = cycle;
      viewportX = -1;
      viewportY = -1;
      WorldMapID.hoveredItemContainer = null;
      if (rootInterface != -1) {
         rootWidgetCount = 0;
         HealthBar.drawWidgets(rootInterface, 0, 0, CollisionMap.canvasWidth, Language.canvasHeight, 0, 0, -1);
      }

      Rasterizer2D.Rasterizer2D_resetClip();
      if (showMouseCross) {
         if (mouseCrossColor == 1) {
            MouseHandler.crossSprites[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
         }

         if (mouseCrossColor == 2) {
            MouseHandler.crossSprites[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
         }
      }

      int var2;
      int var3;
      if (!isMenuOpen) {
         if (viewportX != -1) {
            var1 = viewportX;
            var2 = viewportY;
            if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) {
               var3 = menuOptionsCount - 1;
               String var5;
               if (isItemSelected == 1 && menuOptionsCount < 2) {
                  var5 = "Use" + " " + selectedItemName + " " + "->";
               } else if (isSpellSelected && menuOptionsCount < 2) {
                  var5 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
               } else {
                  String var6;
                  if (var3 < 0) {
                     var6 = "";
                  } else if (menuTargets[var3].length() > 0) {
                     var6 = menuActions[var3] + " " + menuTargets[var3];
                  } else {
                     var6 = menuActions[var3];
                  }

                  var5 = var6;
               }

               if (menuOptionsCount > 2) {
                  var5 = var5 + MouseRecorder.colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2) + " more options";
               }

               class146.fontBold12.drawRandomAlphaAndSpacing(var5, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000);
            }
         }
      } else {
         GrandExchangeOfferOwnWorldComparator.method1219();
      }

      if (gameDrawingMode == 3) {
         for(var1 = 0; var1 < rootWidgetCount; ++var1) {
            if (field733[var1]) {
               Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
            } else if (field732[var1]) {
               Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
            }
         }
      }

      var1 = class383.Client_plane;
      var2 = class155.localPlayer.x;
      var3 = class155.localPlayer.y;
      int var4 = graphicsCycle;

      for(ObjectSound var14 = (ObjectSound)ObjectSound.objectSounds.last(); var14 != null; var14 = (ObjectSound)ObjectSound.objectSounds.previous()) {
         if (var14.soundEffectId != -1 || var14.soundEffectIds != null) {
            int var12 = 0;
            if (var2 > var14.maxX * 128) {
               var12 += var2 - var14.maxX * 128;
            } else if (var2 < var14.x * 16384) {
               var12 += var14.x * 16384 - var2;
            }

            if (var3 > var14.maxY * 16384) {
               var12 += var3 - var14.maxY * 16384;
            } else if (var3 < var14.y * 16384) {
               var12 += var14.y * 16384 - var3;
            }

            if (var12 - 64 <= var14.field847 && StructComposition.clientPreferences.method2506() != 0 && var1 == var14.plane) {
               var12 -= 64;
               if (var12 < 0) {
                  var12 = 0;
               }

               int var7 = (var14.field847 - var12) * StructComposition.clientPreferences.method2506() / var14.field847;
               Object var10000;
               if (var14.stream1 == null) {
                  if (var14.soundEffectId >= 0) {
                     var10000 = null;
                     SoundEffect var8 = SoundEffect.readSoundEffect(WorldMapSection0.field2932, var14.soundEffectId, 0);
                     if (var8 != null) {
                        RawSound var9 = var8.toRawSound().resample(DevicePcmPlayerProvider.decimator);
                        RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var7);
                        var10.setNumLoops(-1);
                        ApproximateRouteStrategy.pcmStreamMixer.addSubStream(var10);
                        var14.stream1 = var10;
                     }
                  }
               } else {
                  var14.stream1.method906(var7);
               }

               if (var14.stream2 == null) {
                  if (var14.soundEffectIds != null && (var14.field850 -= var4) <= 0) {
                     int var13 = (int)(Math.random() * (double)var14.soundEffectIds.length);
                     var10000 = null;
                     SoundEffect var15 = SoundEffect.readSoundEffect(WorldMapSection0.field2932, var14.soundEffectIds[var13], 0);
                     if (var15 != null) {
                        RawSound var16 = var15.toRawSound().resample(DevicePcmPlayerProvider.decimator);
                        RawPcmStream var11 = RawPcmStream.createRawPcmStream(var16, 100, var7);
                        var11.setNumLoops(0);
                        ApproximateRouteStrategy.pcmStreamMixer.addSubStream(var11);
                        var14.stream2 = var11;
                        var14.field850 = var14.field842 + (int)(Math.random() * (double)(var14.field839 - var14.field842));
                     }
                  }
               } else {
                  var14.stream2.method906(var7);
                  if (!var14.stream2.hasNext()) {
                     var14.stream2 = null;
                  }
               }
            } else {
               if (var14.stream1 != null) {
                  ApproximateRouteStrategy.pcmStreamMixer.removeSubStream(var14.stream1);
                  var14.stream1 = null;
               }

               if (var14.stream2 != null) {
                  ApproximateRouteStrategy.pcmStreamMixer.removeSubStream(var14.stream2);
                  var14.stream2 = null;
               }
            }
         }
      }

      graphicsCycle = 0;
   }

   @ObfuscatedName("ic")
   @ObfuscatedSignature(
      descriptor = "(Lde;II)Z",
      garbageValue = "-1959466740"
   )
   boolean method1432(PacketWriter var1, int var2) {
      if (var1.serverPacketLength == 0) {
         class281.friendsChat = null;
      } else {
         if (class281.friendsChat == null) {
            class281.friendsChat = new FriendsChat(SecureRandomFuture.loginType, BuddyRankComparator.client);
         }

         class281.friendsChat.method7444(var1.packetBuffer, var2);
      }

      field610 = cycleCntr;
      class281.ClanChat_inClanChat = true;
      var1.serverPacket = null;
      return true;
   }

   @ObfuscatedName("iw")
   @ObfuscatedSignature(
      descriptor = "(Lde;I)Z",
      garbageValue = "-1099758914"
   )
   boolean method1428(PacketWriter var1) {
      if (class281.friendsChat != null) {
         class281.friendsChat.method7437(var1.packetBuffer);
      }

      field610 = cycleCntr;
      class281.ClanChat_inClanChat = true;
      var1.serverPacket = null;
      return true;
   }

   @ObfuscatedName("il")
   @ObfuscatedSignature(
      descriptor = "(Lde;I)Z",
      garbageValue = "-42701230"
   )
   final boolean method1727(PacketWriter var1) {
      AbstractSocket var2 = var1.getSocket();
      PacketBuffer var3 = var1.packetBuffer;
      if (var2 == null) {
         return false;
      } else {
         String var21;
         int var27;
         try {
            int var5;
            if (var1.serverPacket == null) {
               if (var1.field1430) {
                  if (!var2.isAvailable(1)) {
                     return false;
                  }

                  var2.read(var1.packetBuffer.array, 0, 1);
                  var1.field1420 = 0;
                  var1.field1430 = false;
               }

               var3.offset = 0;
               if (var3.method8496()) {
                  if (!var2.isAvailable(1)) {
                     return false;
                  }

                  var2.read(var1.packetBuffer.array, 1, 1);
                  var1.field1420 = 0;
               }

               var1.field1430 = true;
               ServerPacket[] var4 = EnumComposition.ServerPacket_values();
               var5 = var3.readSmartByteShortIsaac();
               if (var5 < 0 || var5 >= var4.length) {
                  throw new IOException(var5 + " " + var3.offset);
               }

               var1.serverPacket = var4[var5];
               var1.serverPacketLength = var1.serverPacket.length;
            }

            if (var1.serverPacketLength == -1) {
               if (!var2.isAvailable(1)) {
                  return false;
               }

               var1.getSocket().read(var3.array, 0, 1);
               var1.serverPacketLength = var3.array[0] & 255;
            }

            if (var1.serverPacketLength == -2) {
               if (!var2.isAvailable(2)) {
                  return false;
               }

               var1.getSocket().read(var3.array, 0, 2);
               var3.offset = 0;
               var1.serverPacketLength = var3.readUnsignedShort();
            }

            if (!var2.isAvailable(var1.serverPacketLength)) {
               return false;
            }

            var3.offset = 0;
            var2.read(var3.array, 0, var1.serverPacketLength);
            var1.field1420 = 0;
            timer.method7352();
            var1.field1433 = var1.field1432;
            var1.field1432 = var1.field1431;
            var1.field1431 = var1.serverPacket;
            if (ServerPacket.field3208 == var1.serverPacket) {
               DevicePcmPlayerProvider.method315(class276.field3171);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3193 == var1.serverPacket) {
               DevicePcmPlayerProvider.method315(class276.field3168);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.NPC_INFO_LARGE_VIEWPORT_2 == var1.serverPacket) {
               class312.updateNpcs(false, var3);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3206 == var1.serverPacket) {
               if (LoginScreenAnimation.field1286 == null) {
                  LoginScreenAnimation.field1286 = new class414(class34.HitSplatDefinition_cached);
               }

               class475 var54 = class34.HitSplatDefinition_cached.method7877(var3);
               LoginScreenAnimation.field1286.field4644.vmethod8269(var54.field4980, var54.field4981);
               field712[++field713 - 1 & 31] = var54.field4980;
               var1.serverPacket = null;
               return true;
            }

            int var20;
            if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
               InvDefinition.field1918 = var3.readUnsignedByte();
               class125.field1560 = var3.readUnsignedByteSub();

               while(var3.offset < var1.serverPacketLength) {
                  var20 = var3.readUnsignedByte();
                  class276 var79 = SpotAnimationDefinition.method3732()[var20];
                  DevicePcmPlayerProvider.method315(var79);
               }

               var1.serverPacket = null;
               return true;
            }

            Widget var6;
            int var7;
            int var8;
            int var9;
            if (ServerPacket.UPDATE_INV_FULL == var1.serverPacket) {
               var20 = var3.readInt();
               var5 = var3.readUnsignedShort();
               if (var20 < -70000) {
                  var5 += 32768;
               }

               if (var20 >= 0) {
                  var6 = PlayerCompositionColorTextureOverride.getWidget(var20);
               } else {
                  var6 = null;
               }

               for(; var3.offset < var1.serverPacketLength; class12.itemContainerSetItem(var5, var7, var8 - 1, var9)) {
                  var7 = var3.readUShortSmart();
                  var8 = var3.readUnsignedShort();
                  var9 = 0;
                  if (var8 != 0) {
                     var9 = var3.readUnsignedByte();
                     if (var9 == 255) {
                        var9 = var3.readInt();
                     }
                  }

                  if (var6 != null && var7 >= 0 && var7 < var6.itemIds.length) {
                     var6.itemIds[var7] = var8;
                     var6.itemQuantities[var7] = var9;
                  }
               }

               if (var6 != null) {
                  class69.invalidateWidget(var6);
               }

               class136.method3073();
               changedItemContainers[++field709 - 1 & 31] = var5 & 32767;
               var1.serverPacket = null;
               return true;
            }

            GameObject var14;
            int var15;
            int var16;
            String var26;
            byte var74;
            if (ServerPacket.field3283 == var1.serverPacket) {
               var74 = var3.readByte();
               var21 = var3.readStringCp1252NullTerminated();
               long var22 = (long)var3.readUnsignedShort();
               long var24 = (long)var3.readMedium();
               PlayerType var60 = (PlayerType)World.findEnumerated(class149.PlayerType_values(), var3.readUnsignedByte());
               long var11 = var24 + (var22 << 32);
               boolean var68 = false;
               var14 = null;
               ClanChannel var69 = var74 >= 0 ? currentClanChannels[var74] : VarcInt.guestClanChannel;
               if (var69 == null) {
                  var68 = true;
               } else {
                  var15 = 0;

                  while(true) {
                     if (var15 >= 100) {
                        if (var60.isUser && DefaultsGroup.friendSystem.isIgnored(new Username(var21, SecureRandomFuture.loginType))) {
                           var68 = true;
                        }
                        break;
                     }

                     if (var11 == crossWorldMessageIds[var15]) {
                        var68 = true;
                        break;
                     }

                     ++var15;
                  }
               }

               if (!var68) {
                  crossWorldMessageIds[crossWorldMessageIdsIndex] = var11;
                  crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
                  var26 = AbstractFont.escapeBrackets(class153.method3285(var3));
                  var16 = var74 >= 0 ? 41 : 44;
                  if (var60.modIcon != -1) {
                     class381.addChatMessage(var16, class456.method8410(var60.modIcon) + var21, var26, var69.name);
                  } else {
                     class381.addChatMessage(var16, var21, var26, var69.name);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
               isCameraLocked = true;
               field772 = false;
               class155.field1787 = var3.readUnsignedByte() * 16384;
               class34.field208 = var3.readUnsignedByte() * 128;
               Script.field1001 = var3.readUnsignedShort();
               class31.field181 = var3.readUnsignedByte();
               Tile.field2481 = var3.readUnsignedByte();
               if (Tile.field2481 >= 100) {
                  class145.cameraX = class155.field1787 * 128 + 64;
                  ClanChannel.cameraZ = class34.field208 * 16384 + 64;
                  class414.cameraY = SpotAnimationDefinition.getTileHeight(class145.cameraX, ClanChannel.cameraZ, class383.Client_plane) - Script.field1001;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.MIDI_SONG == var1.serverPacket) {
               var20 = var3.readUnsignedShortAdd();
               if (var20 == 65535) {
                  var20 = -1;
               }

               class169.playSong(var20);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3248 == var1.serverPacket) {
               var20 = var3.method8629();
               var5 = var3.readUnsignedShortLE();
               if (var5 == 65535) {
                  var5 = -1;
               }

               class16.method197(var5, var20);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3192 == var1.serverPacket) {
               LoginScreenAnimation.field1286 = null;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3267 == var1.serverPacket) {
               field513 = cycleCntr;
               var74 = var3.readByte();
               class153 var78 = new class153(var3);
               ClanChannel var63;
               if (var74 >= 0) {
                  var63 = currentClanChannels[var74];
               } else {
                  var63 = VarcInt.guestClanChannel;
               }

               var78.method3284(var63);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) {
               var20 = var3.readUnsignedIntME();
               var5 = var3.readUnsignedShortAddLE();
               var27 = var5 >> 10 & 31;
               var7 = var5 >> 5 & 31;
               var8 = var5 & 31;
               var9 = (var7 << 11) + (var27 << 19) + (var8 << 3);
               Widget var59 = PlayerCompositionColorTextureOverride.getWidget(var20);
               if (var9 != var59.color) {
                  var59.color = var9;
                  class69.invalidateWidget(var59);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3290 == var1.serverPacket) {
               for(var20 = 0; var20 < players.length; ++var20) {
                  if (players[var20] != null) {
                     players[var20].sequence = -1;
                  }
               }

               for(var20 = 0; var20 < npcs.length; ++var20) {
                  if (npcs[var20] != null) {
                     npcs[var20].sequence = -1;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_STOCKMARKET_SLOT == var1.serverPacket) {
               var20 = var3.readUnsignedByte();
               if (var3.readUnsignedByte() == 0) {
                  grandExchangeOffers[var20] = new GrandExchangeOffer();
                  var3.offset += 18;
               } else {
                  --var3.offset;
                  grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false);
               }

               field777 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
               InterfaceParent.loadRegions(false, var1.packetBuffer);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.EVENT_WORLDHOP == var1.serverPacket) {
               World var53 = new World();
               var53.host = var3.readStringCp1252NullTerminated();
               var53.id = var3.readUnsignedShort();
               var5 = var3.readInt();
               var53.properties = var5;
               class140.updateGameState(45);
               var2.close();
               var2 = null;
               UserComparator6.changeWorld(var53);
               var1.serverPacket = null;
               return false;
            }

            if (ServerPacket.field3229 == var1.serverPacket) {
               GameEngine.method563();
               var74 = var3.readByte();
               if (var1.serverPacketLength == 1) {
                  if (var74 >= 0) {
                     currentClanSettings[var74] = null;
                  } else {
                     class20.guestClanSettings = null;
                  }

                  var1.serverPacket = null;
                  return true;
               }

               if (var74 >= 0) {
                  currentClanSettings[var74] = new ClanSettings(var3);
               } else {
                  class20.guestClanSettings = new ClanSettings(var3);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3221 == var1.serverPacket) {
               DevicePcmPlayerProvider.method315(class276.field3160);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) {
               LoginScreenAnimation.privateChatMode = SceneTilePaint.method4808(var3.readUnsignedByte());
               var1.serverPacket = null;
               return true;
            }

            int var13;
            long var28;
            long var30;
            String var35;
            String var49;
            if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
               var49 = var3.readStringCp1252NullTerminated();
               var28 = (long)var3.readUnsignedShort();
               var30 = (long)var3.readMedium();
               PlayerType var32 = (PlayerType)World.findEnumerated(class149.PlayerType_values(), var3.readUnsignedByte());
               long var33 = var30 + (var28 << 32);
               boolean var64 = false;

               for(var13 = 0; var13 < 100; ++var13) {
                  if (crossWorldMessageIds[var13] == var33) {
                     var64 = true;
                     break;
                  }
               }

               if (DefaultsGroup.friendSystem.isIgnored(new Username(var49, SecureRandomFuture.loginType))) {
                  var64 = true;
               }

               if (!var64 && field691 == 0) {
                  crossWorldMessageIds[crossWorldMessageIdsIndex] = var33;
                  crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
                  var35 = AbstractFont.escapeBrackets(VarbitComposition.method3779(class153.method3285(var3)));
                  byte var83;
                  if (var32.isPrivileged) {
                     var83 = 7;
                  } else {
                     var83 = 3;
                  }

                  if (var32.modIcon != -1) {
                     KitDefinition.addGameMessage(var83, class456.method8410(var32.modIcon) + var49, var35);
                  } else {
                     KitDefinition.addGameMessage(var83, var49, var35);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            int var12;
            int var17;
            int var18;
            Projectile var19;
            int var36;
            int var38;
            byte var61;
            int var84;
            byte var87;
            if (ServerPacket.field3279 == var1.serverPacket) {
               var61 = var3.readByte();
               var27 = var3.method8595();
               var20 = var27 >> 16;
               var5 = var27 >> 8 & 255;
               var7 = var20 + (var27 >> 4 & 7);
               var8 = var5 + (var27 & 7);
               var84 = var3.readShort();
               var15 = var3.readUnsignedShortAddLE();
               var87 = var3.readByteNeg();
               var17 = var3.readUnsignedByteSub();
               var13 = var3.readUnsignedByteNeg() * 4;
               var16 = var3.readUnsignedShortAddLE();
               var18 = var3.readUnsignedByte();
               var12 = var3.readUnsignedShortAdd();
               var36 = var3.readUnsignedByteNeg() * 4;
               var9 = var61 + var7;
               var38 = var87 + var8;
               if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var9 >= 0 && var38 >= 0 && var9 < 104 && var38 < 104 && var12 != 65535) {
                  var7 = var7 * 128 + 64;
                  var8 = var8 * 128 + 64;
                  var9 = var9 * 128 + 64;
                  var38 = var38 * 128 + 64;
                  var19 = new Projectile(var12, class383.Client_plane, var7, var8, SpotAnimationDefinition.getTileHeight(var7, var8, class383.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var84, var36);
                  var19.setDestination(var9, var38, SpotAnimationDefinition.getTileHeight(var9, var38, class383.Client_plane) - var36, var15 + cycle);
                  projectiles.addFirst(var19);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) {
               var36 = var3.readUnsignedByteAdd() * 4;
               var87 = var3.readByteNeg();
               var17 = var3.readUnsignedByte();
               var61 = var3.readByteNeg();
               var12 = var3.readUnsignedShortAddLE();
               var84 = var3.method8674();
               var27 = var3.method8594();
               var20 = var27 >> 16;
               var5 = var27 >> 8 & 255;
               var7 = var20 + (var27 >> 4 & 7);
               var8 = var5 + (var27 & 7);
               var13 = var3.readUnsignedByte() * 4;
               var18 = var3.readUnsignedByteSub();
               var15 = var3.readUnsignedShortLE();
               var16 = var3.readUnsignedShortAddLE();
               var9 = var61 + var7;
               var38 = var87 + var8;
               if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var9 >= 0 && var38 >= 0 && var9 < 104 && var38 < 104 && var12 != 65535) {
                  var7 = var7 * 128 + 64;
                  var8 = var8 * 128 + 64;
                  var9 = var9 * 128 + 64;
                  var38 = var38 * 128 + 64;
                  var19 = new Projectile(var12, class383.Client_plane, var7, var8, SpotAnimationDefinition.getTileHeight(var7, var8, class383.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var84, var36);
                  var19.setDestination(var9, var38, SpotAnimationDefinition.getTileHeight(var9, var38, class383.Client_plane) - var36, var15 + cycle);
                  projectiles.addFirst(var19);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_IGNORELIST == var1.serverPacket) {
               DefaultsGroup.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
               AbstractWorldMapData.FriendSystem_invalidateIgnoreds();
               field715 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.VARP_SMALL == var1.serverPacket) {
               var20 = var3.readUnsignedShortAdd();
               byte var70 = var3.readByteSub();
               Varps.Varps_temp[var20] = var70;
               if (Varps.Varps_main[var20] != var70) {
                  Varps.Varps_main[var20] = var70;
               }

               MouseRecorder.changeGameOptions(var20);
               changedVarps[++changedVarpCount - 1 & 31] = var20;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3249 == var1.serverPacket) {
               DefaultsGroup.friendSystem.method1822();
               field715 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) {
               var20 = var3.readUnsignedByteAdd();
               var21 = var3.readStringCp1252NullTerminated();
               var27 = var3.readUnsignedByte();
               if (var27 >= 1 && var27 <= 8) {
                  if (var21.equalsIgnoreCase("null")) {
                     var21 = null;
                  }

                  playerMenuActions[var27 - 1] = var21;
                  playerOptionsPriorities[var27 - 1] = var20 == 0;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) {
               var20 = var3.readUnsignedShortLE();
               Player var92;
               if (var20 == localPlayerIndex) {
                  var92 = class155.localPlayer;
               } else {
                  var92 = players[var20];
               }

               var5 = var3.readUnsignedShortAdd();
               var27 = var3.readUnsignedIntME();
               if (var92 != null) {
                  var92.spotAnimation = var5;
                  var92.spotAnimationHeight = var27 >> 16;
                  var92.field1227 = (var27 & '\uffff') + cycle;
                  var92.spotAnimationFrame = 0;
                  var92.spotAnimationFrameCycle = 0;
                  if (var92.field1227 > cycle) {
                     var92.spotAnimationFrame = -1;
                  }

                  if (var92.spotAnimation == 65535) {
                     var92.spotAnimation = -1;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.REBUILD_REGION == var1.serverPacket) {
               InterfaceParent.loadRegions(true, var1.packetBuffer);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_REBOOT_TIMER == var1.serverPacket) {
               rebootTimer = var3.readUnsignedShortLE() * 30;
               field721 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3232 == var1.serverPacket) {
               field513 = cycleCntr;
               var74 = var3.readByte();
               if (var1.serverPacketLength == 1) {
                  if (var74 >= 0) {
                     currentClanChannels[var74] = null;
                  } else {
                     VarcInt.guestClanChannel = null;
                  }

                  var1.serverPacket = null;
                  return true;
               }

               if (var74 >= 0) {
                  currentClanChannels[var74] = new ClanChannel(var3);
               } else {
                  VarcInt.guestClanChannel = new ClanChannel(var3);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3183 == var1.serverPacket) {
               var20 = var3.readUnsignedShortLE();
               rootInterface = var20;
               this.resizeRoot(false);
               class69.Widget_resetModelFrames(var20);
               class31.runWidgetOnLoadListener(rootInterface);

               for(var5 = 0; var5 < 100; ++var5) {
                  field731[var5] = true;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3284 == var1.serverPacket) {
               DevicePcmPlayerProvider.method315(class276.field3164);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3295 == var1.serverPacket) {
               class136.method3073();
               runEnergy = var3.readUnsignedShort();
               field721 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) {
               for(var20 = 0; var20 < VarpDefinition.field1922; ++var20) {
                  VarpDefinition var77 = class109.VarpDefinition_get(var20);
                  if (var77 != null) {
                     Varps.Varps_temp[var20] = 0;
                     Varps.Varps_main[var20] = 0;
                  }
               }

               class136.method3073();
               changedVarpCount += 32;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.CAM_RESET == var1.serverPacket) {
               isCameraLocked = false;

               for(var20 = 0; var20 < 5; ++var20) {
                  field773[var20] = false;
               }

               var1.serverPacket = null;
               return true;
            }

            Widget var86;
            if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
               var20 = var3.readShortLE();
               var5 = var3.readUnsignedIntME();
               var27 = var3.readShort();
               var86 = PlayerCompositionColorTextureOverride.getWidget(var5);
               if (var27 != var86.rawX || var20 != var86.rawY || var86.xAlignment != 0 || var86.yAlignment != 0) {
                  var86.rawX = var27;
                  var86.rawY = var20;
                  var86.xAlignment = 0;
                  var86.yAlignment = 0;
                  class69.invalidateWidget(var86);
                  this.alignWidget(var86);
                  if (var86.type == 0) {
                     class169.revalidateWidgetScroll(class71.Widget_interfaceComponents[var5 >> 16], var86, false);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3215 == var1.serverPacket && isCameraLocked) {
               field772 = true;
               class31.field181 = var3.readUnsignedByte();
               Tile.field2481 = var3.readUnsignedByte();
               class415.field4647 = var3.readUnsignedByte();
               LoginScreenAnimation.field1283 = var3.readUnsignedByte();

               for(var20 = 0; var20 < 5; ++var20) {
                  field773[var20] = false;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_STAT == var1.serverPacket) {
               class136.method3073();
               var20 = var3.readUnsignedIntME();
               var5 = var3.readUnsignedByteNeg();
               var27 = var3.readUnsignedByteNeg();
               experience[var27] = var20;
               currentLevels[var27] = var5;
               levels[var27] = 1;

               for(var7 = 0; var7 < 98; ++var7) {
                  if (var20 >= Skills.Skills_experienceTable[var7]) {
                     levels[var27] = var7 + 2;
                  }
               }

               changedSkills[++changedSkillsCount - 1 & 31] = var27;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3205 == var1.serverPacket) {
               GameEngine.method563();
               var74 = var3.readByte();
               class139 var76 = new class139(var3);
               ClanSettings var58;
               if (var74 >= 0) {
                  var58 = currentClanSettings[var74];
               } else {
                  var58 = class20.guestClanSettings;
               }

               var76.method3094(var58);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3296 == var1.serverPacket) {
               var20 = var3.readInt();
               var5 = var3.readUnsignedByteNeg();
               short var81 = (short)var3.readShort();
               var7 = var3.readUnsignedShortAddLE();
               NPC var91 = npcs[var7];
               if (var91 != null) {
                  var91.method2539(var5, var20, var81);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.HINT_ARROW == var1.serverPacket) {
               hintArrowType = var3.readUnsignedByte();
               if (hintArrowType == 1) {
                  hintArrowNpcIndex = var3.readUnsignedShort();
               }

               if (hintArrowType >= 2 && hintArrowType <= 6) {
                  if (hintArrowType == 2) {
                     hintArrowSubX = 4096;
                     hintArrowSubY = 4096;
                  }

                  if (hintArrowType == 3) {
                     hintArrowSubX = 0;
                     hintArrowSubY = 4096;
                  }

                  if (hintArrowType == 4) {
                     hintArrowSubX = 8192;
                     hintArrowSubY = 4096;
                  }

                  if (hintArrowType == 5) {
                     hintArrowSubX = 4096;
                     hintArrowSubY = 0;
                  }

                  if (hintArrowType == 6) {
                     hintArrowSubX = 4096;
                     hintArrowSubY = 8192;
                  }

                  hintArrowType = 2;
                  hintArrowX = var3.readUnsignedShort();
                  hintArrowY = var3.readUnsignedShort();
                  hintArrowHeight = var3.readUnsignedByte() * 2;
               }

               if (hintArrowType == 10) {
                  hintArrowPlayerIndex = var3.readUnsignedShort();
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3223 == var1.serverPacket) {
               DevicePcmPlayerProvider.method315(class276.field3157);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) {
               var27 = var3.readMedium();
               var20 = var27 >> 16;
               var5 = var27 >> 8 & 255;
               var7 = var20 + (var27 >> 4 & 7);
               var8 = var5 + (var27 & 7);
               var9 = var3.readUnsignedByteNeg();
               var38 = var9 >> 2;
               var84 = var9 & 3;
               var12 = field579[var38];
               var13 = var3.readUnsignedShortLE();
               if (var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) {
                  if (var12 == 0) {
                     BoundaryObject var67 = ReflectionCheck.scene.method4452(class383.Client_plane, var7, var8);
                     if (var67 != null) {
                        var15 = Occluder.Entity_unpackID(var67.tag);
                        if (var38 == 2) {
                           var67.renderable1 = new DynamicObject(var15, 2, var84 + 4, class383.Client_plane, var7, var8, var13, false, var67.renderable1);
                           var67.renderable2 = new DynamicObject(var15, 2, var84 + 1 & 3, class383.Client_plane, var7, var8, var13, false, var67.renderable2);
                        } else {
                           var67.renderable1 = new DynamicObject(var15, var38, var84, class383.Client_plane, var7, var8, var13, false, var67.renderable1);
                        }
                     }
                  } else if (var12 == 1) {
                     WallDecoration var66 = ReflectionCheck.scene.method4604(class383.Client_plane, var7, var8);
                     if (var66 != null) {
                        var15 = Occluder.Entity_unpackID(var66.tag);
                        if (var38 != 4 && var38 != 5) {
                           if (var38 == 6) {
                              var66.renderable1 = new DynamicObject(var15, 4, var84 + 4, class383.Client_plane, var7, var8, var13, false, var66.renderable1);
                           } else if (var38 == 7) {
                              var66.renderable1 = new DynamicObject(var15, 4, (var84 + 2 & 3) + 4, class383.Client_plane, var7, var8, var13, false, var66.renderable1);
                           } else if (var38 == 8) {
                              var66.renderable1 = new DynamicObject(var15, 4, var84 + 4, class383.Client_plane, var7, var8, var13, false, var66.renderable1);
                              var66.renderable2 = new DynamicObject(var15, 4, (var84 + 2 & 3) + 4, class383.Client_plane, var7, var8, var13, false, var66.renderable2);
                           }
                        } else {
                           var66.renderable1 = new DynamicObject(var15, 4, var84, class383.Client_plane, var7, var8, var13, false, var66.renderable1);
                        }
                     }
                  } else if (var12 == 2) {
                     var14 = ReflectionCheck.scene.getGameObject(class383.Client_plane, var7, var8);
                     if (var38 == 11) {
                        var38 = 10;
                     }

                     if (var14 != null) {
                        var14.renderable = new DynamicObject(Occluder.Entity_unpackID(var14.tag), var38, var84, class383.Client_plane, var7, var8, var13, false, var14.renderable);
                     }
                  } else if (var12 == 3) {
                     FloorDecoration var65 = ReflectionCheck.scene.getFloorDecoration(class383.Client_plane, var7, var8);
                     if (var65 != null) {
                        var65.renderable = new DynamicObject(Occluder.Entity_unpackID(var65.tag), 22, var84, class383.Client_plane, var7, var8, var13, false, var65.renderable);
                     }
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
               class19.updatePlayers(var3, var1.serverPacketLength);
               WorldMapID.method5276();
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3227 == var1.serverPacket) {
               class200.isLargePlayerInfo = true;
               class19.updatePlayers(var3, var1.serverPacketLength);
               WorldMapID.method5276();
               var1.serverPacket = null;
               return true;
            }

            InterfaceParent var85;
            if (ServerPacket.field3247 == var1.serverPacket) {
               var20 = var3.readUnsignedIntLE();
               var5 = var3.readUnsignedByteNeg();
               var27 = var3.readUnsignedShort();
               var85 = (InterfaceParent)interfaceParents.get((long)var20);
               if (var85 != null) {
                  class9.closeInterface(var85, var27 != var85.group);
               }

               class7.method44(var20, var27, var5);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3288 == var1.serverPacket) {
               var20 = var3.readUnsignedIntIME();
               var5 = var3.readUnsignedShort();
               var27 = var3.readUnsignedShort();
               var86 = PlayerCompositionColorTextureOverride.getWidget(var20);
               var86.field3598 = var27 + (var5 << 16);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3281 == var1.serverPacket) {
               return this.method1428(var1);
            }

            if (ServerPacket.field3292 == var1.serverPacket) {
               DevicePcmPlayerProvider.method315(class276.field3169);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3214 == var1.serverPacket) {
               return this.method1432(var1, 1);
            }

            Widget var40;
            if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
               var20 = var3.readUnsignedIntIME();
               var5 = var3.readInt();
               InterfaceParent var57 = (InterfaceParent)interfaceParents.get((long)var20);
               var85 = (InterfaceParent)interfaceParents.get((long)var5);
               if (var85 != null) {
                  class9.closeInterface(var85, var57 == null || var85.group != var57.group);
               }

               if (var57 != null) {
                  var57.remove();
                  interfaceParents.put(var57, (long)var5);
               }

               var40 = PlayerCompositionColorTextureOverride.getWidget(var20);
               if (var40 != null) {
                  class69.invalidateWidget(var40);
               }

               var40 = PlayerCompositionColorTextureOverride.getWidget(var5);
               if (var40 != null) {
                  class69.invalidateWidget(var40);
                  class169.revalidateWidgetScroll(class71.Widget_interfaceComponents[var40.id >>> 16], var40, true);
               }

               if (rootInterface != -1) {
                  GrandExchangeOfferAgeComparator.runIntfCloseListeners(rootInterface, 1);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3297 == var1.serverPacket) {
               var20 = var3.readUnsignedIntLE();
               var5 = var3.readUnsignedShort();
               var6 = PlayerCompositionColorTextureOverride.getWidget(var20);
               if (var6.modelType != 6 || var5 != var6.modelId) {
                  var6.modelType = 6;
                  var6.modelId = var5;
                  class69.invalidateWidget(var6);
               }

               var1.serverPacket = null;
               return true;
            }

            boolean var55;
            String var56;
            if (ServerPacket.MESSAGE_GAME == var1.serverPacket) {
               var20 = var3.readUShortSmart();
               var55 = var3.readUnsignedByte() == 1;
               var56 = "";
               boolean var62 = false;
               if (var55) {
                  var56 = var3.readStringCp1252NullTerminated();
                  if (DefaultsGroup.friendSystem.isIgnored(new Username(var56, SecureRandomFuture.loginType))) {
                     var62 = true;
                  }
               }

               String var90 = var3.readStringCp1252NullTerminated();
               if (!var62) {
                  KitDefinition.addGameMessage(var20, var56, var90);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.URL_OPEN == var1.serverPacket) {
               byte[] var51 = new byte[var1.serverPacketLength];
               var3.method8492(var51, 0, var51.length);
               Buffer var75 = new Buffer(var51);
               var56 = var75.readStringCp1252NullTerminated();
               ModeWhere.openURL(var56, true, false);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.LOGOUT_FULL == var1.serverPacket) {
               Player.logOut();
               var1.serverPacket = null;
               return false;
            }

            if (ServerPacket.IF_SETMODEL == var1.serverPacket) {
               var20 = var3.readUnsignedIntIME();
               var5 = var3.readUnsignedShortAdd();
               var6 = PlayerCompositionColorTextureOverride.getWidget(var20);
               if (var6.modelType != 1 || var5 != var6.modelId) {
                  var6.modelType = 1;
                  var6.modelId = var5;
                  class69.invalidateWidget(var6);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3263 == var1.serverPacket) {
               var20 = var3.readShort();
               var5 = var3.readUnsignedIntME();
               var6 = PlayerCompositionColorTextureOverride.getWidget(var5);
               if (var20 != var6.sequenceId || var20 == -1) {
                  var6.sequenceId = var20;
                  var6.modelFrame = 0;
                  var6.modelFrameCycle = 0;
                  class69.invalidateWidget(var6);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.NPC_INFO_LARGE_VIEWPORT_1 == var1.serverPacket) {
               ParamComposition.field2121 = true;
               class312.updateNpcs(false, var3);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3194 == var1.serverPacket) {
               DevicePcmPlayerProvider.method315(class276.field3166);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3226 == var1.serverPacket) {
               DevicePcmPlayerProvider.method315(class276.field3167);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
               class125.field1560 = var3.readUnsignedByteAdd();
               InvDefinition.field1918 = var3.readUnsignedByteSub();

               for(var20 = InvDefinition.field1918; var20 < InvDefinition.field1918 + 8; ++var20) {
                  for(var5 = class125.field1560; var5 < class125.field1560 + 8; ++var5) {
                     if (groundItems[class383.Client_plane][var20][var5] != null) {
                        groundItems[class383.Client_plane][var20][var5] = null;
                        class358.updateItemPile(var20, var5);
                     }
                  }
               }

               for(PendingSpawn var50 = (PendingSpawn)pendingSpawns.last(); var50 != null; var50 = (PendingSpawn)pendingSpawns.previous()) {
                  if (var50.x >= InvDefinition.field1918 && var50.x < InvDefinition.field1918 + 8 && var50.y >= class125.field1560 && var50.y < class125.field1560 + 8 && var50.plane == class383.Client_plane) {
                     var50.hitpoints = 0;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3268 == var1.serverPacket) {
               LoginScreenAnimation.field1286 = new class414(class34.HitSplatDefinition_cached);
               var1.serverPacket = null;
               return true;
            }

            NPC var39;
            if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) {
               var27 = var3.readUnsignedByteSub();
               var20 = var3.readUnsignedShortAdd();
               var5 = var3.readUnsignedShortLE();
               if (var5 == 65535) {
                  var5 = -1;
               }

               var39 = npcs[var20];
               if (var39 != null) {
                  if (var5 == var39.sequence && var5 != -1) {
                     var8 = AABB.SequenceDefinition_get(var5).field2276;
                     if (var8 == 1) {
                        var39.sequenceFrame = 0;
                        var39.sequenceFrameCycle = 0;
                        var39.sequenceDelay = var27;
                        var39.field1223 = 0;
                     } else if (var8 == 2) {
                        var39.field1223 = 0;
                     }
                  } else if (var5 == -1 || var39.sequence == -1 || AABB.SequenceDefinition_get(var5).field2300 >= AABB.SequenceDefinition_get(var39.sequence).field2300) {
                     var39.sequence = var5;
                     var39.sequenceFrame = 0;
                     var39.sequenceFrameCycle = 0;
                     var39.sequenceDelay = var27;
                     var39.field1223 = 0;
                     var39.field1252 = var39.pathLength;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            long var41;
            long var44;
            if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) {
               var49 = var3.readStringCp1252NullTerminated();
               var28 = var3.readLong();
               var30 = (long)var3.readUnsignedShort();
               var41 = (long)var3.readMedium();
               PlayerType var93 = (PlayerType)World.findEnumerated(class149.PlayerType_values(), var3.readUnsignedByte());
               var44 = (var30 << 32) + var41;
               boolean var82 = false;

               for(var15 = 0; var15 < 100; ++var15) {
                  if (var44 == crossWorldMessageIds[var15]) {
                     var82 = true;
                     break;
                  }
               }

               if (var93.isUser && DefaultsGroup.friendSystem.isIgnored(new Username(var49, SecureRandomFuture.loginType))) {
                  var82 = true;
               }

               if (!var82 && field691 == 0) {
                  crossWorldMessageIds[crossWorldMessageIdsIndex] = var44;
                  crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
                  var26 = AbstractFont.escapeBrackets(VarbitComposition.method3779(class153.method3285(var3)));
                  if (var93.modIcon != -1) {
                     class381.addChatMessage(9, class456.method8410(var93.modIcon) + var49, var26, ModeWhere.base37DecodeLong(var28));
                  } else {
                     class381.addChatMessage(9, var49, var26, ModeWhere.base37DecodeLong(var28));
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) {
               DefaultsGroup.friendSystem.readUpdate(var3, var1.serverPacketLength);
               field715 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            boolean var80;
            if (ServerPacket.field3291 == var1.serverPacket) {
               var80 = var3.readUnsignedByte() == 1;
               if (var80) {
                  WorldMapLabelSize.field2824 = Message.method1197() - var3.readLong();
                  ItemContainer.grandExchangeEvents = new GrandExchangeEvents(var3, true);
               } else {
                  ItemContainer.grandExchangeEvents = null;
               }

               field720 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3224 == var1.serverPacket) {
               DevicePcmPlayerProvider.method315(class276.field3159);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.MINIMAP_TOGGLE == var1.serverPacket) {
               minimapState = var3.readUnsignedByte();
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3286 == var1.serverPacket) {
               var20 = var3.readUnsignedIntME();
               var5 = var3.readUnsignedShortAdd();
               if (var5 == 65535) {
                  var5 = -1;
               }

               var27 = var3.readUnsignedIntME();
               var7 = var3.readUnsignedShortAdd();
               if (var7 == 65535) {
                  var7 = -1;
               }

               for(var8 = var5; var8 <= var7; ++var8) {
                  var41 = (long)var8 + ((long)var20 << 32);
                  Node var43 = widgetFlags.get(var41);
                  if (var43 != null) {
                     var43.remove();
                  }

                  widgetFlags.put(new IntegerNode(var27), var41);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.VARP_LARGE == var1.serverPacket) {
               var20 = var3.readUnsignedShortAdd();
               var5 = var3.readUnsignedIntLE();
               Varps.Varps_temp[var20] = var5;
               if (Varps.Varps_main[var20] != var5) {
                  Varps.Varps_main[var20] = var5;
               }

               MouseRecorder.changeGameOptions(var20);
               changedVarps[++changedVarpCount - 1 & 31] = var20;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3285 == var1.serverPacket) {
               var80 = var3.readBoolean();
               if (var80) {
                  if (GameEngine.field241 == null) {
                     GameEngine.field241 = new class343();
                  }
               } else {
                  GameEngine.field241 = null;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) {
               var9 = var3.readUnsignedShortLE();
               var27 = var3.method8629();
               var20 = var27 >> 16;
               var5 = var27 >> 8 & 255;
               var7 = var20 + (var27 >> 4 & 7);
               var8 = var5 + (var27 & 7);
               var38 = var3.readUnsignedByteNeg();
               var84 = var3.readUnsignedShortAddLE();
               if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                  var7 = var7 * 128 + 64;
                  var8 = var8 * 128 + 64;
                  GraphicsObject var94 = new GraphicsObject(var9, class383.Client_plane, var7, var8, SpotAnimationDefinition.getTileHeight(var7, var8, class383.Client_plane) - var38, var84, cycle);
                  graphicsObjects.addFirst(var94);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3207 == var1.serverPacket) {
               var20 = var3.readUnsignedByte();
               class272.method5475(var20);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) {
               var20 = var3.readInt();
               var5 = var3.readInt();
               var27 = class276.getGcDuration();
               PacketBufferNode var88 = class136.getPacketBufferNode(ClientPacket.PING_STATISTICS, packetWriter.isaacCipher);
               var88.packetBuffer.writeIntME(var20);
               var88.packetBuffer.writeIntLE(var5);
               var88.packetBuffer.writeByte(GameEngine.fps);
               var88.packetBuffer.writeByte(var27);
               packetWriter.addNode(var88);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) {
               for(var20 = 0; var20 < Varps.Varps_main.length; ++var20) {
                  if (Varps.Varps_temp[var20] != Varps.Varps_main[var20]) {
                     Varps.Varps_main[var20] = Varps.Varps_temp[var20];
                     MouseRecorder.changeGameOptions(var20);
                     changedVarps[++changedVarpCount - 1 & 31] = var20;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) {
               MilliClock.readReflectionCheck(var3, var1.serverPacketLength);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3213 == var1.serverPacket) {
               DevicePcmPlayerProvider.method315(class276.field3170);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
               var49 = var3.readStringCp1252NullTerminated();
               var21 = AbstractFont.escapeBrackets(VarbitComposition.method3779(class153.method3285(var3)));
               KitDefinition.addGameMessage(6, var49, var21);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_CLOSESUB == var1.serverPacket) {
               var20 = var3.readInt();
               InterfaceParent var73 = (InterfaceParent)interfaceParents.get((long)var20);
               if (var73 != null) {
                  class9.closeInterface(var73, true);
               }

               if (meslayerContinueWidget != null) {
                  class69.invalidateWidget(meslayerContinueWidget);
                  meslayerContinueWidget = null;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3276 == var1.serverPacket) {
               UrlRequester.method2748(var3.readStringCp1252NullTerminated());
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3199 == var1.serverPacket) {
               var49 = var3.readStringCp1252NullTerminated();
               var5 = var3.readUnsignedIntLE();
               var6 = PlayerCompositionColorTextureOverride.getWidget(var5);
               if (!var49.equals(var6.text)) {
                  var6.text = var49;
                  class69.invalidateWidget(var6);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) {
               var20 = var3.readUnsignedShort();
               var5 = var3.readUnsignedIntLE();
               var6 = PlayerCompositionColorTextureOverride.getWidget(var5);
               if (var6.modelType != 2 || var20 != var6.modelId) {
                  var6.modelType = 2;
                  var6.modelId = var20;
                  class69.invalidateWidget(var6);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3265 == var1.serverPacket) {
               var20 = var3.readUnsignedShort();
               var5 = var3.readUnsignedByte();
               var27 = var3.readUnsignedShort();
               class1.queueSoundEffect(var20, var5, var27);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_INV_PARTIAL == var1.serverPacket) {
               var20 = var3.readInt();
               var5 = var3.readUnsignedShort();
               if (var20 < -70000) {
                  var5 += 32768;
               }

               if (var20 >= 0) {
                  var6 = PlayerCompositionColorTextureOverride.getWidget(var20);
               } else {
                  var6 = null;
               }

               if (var6 != null) {
                  for(var7 = 0; var7 < var6.itemIds.length; ++var7) {
                     var6.itemIds[var7] = 0;
                     var6.itemQuantities[var7] = 0;
                  }
               }

               Script.clearItemContainer(var5);
               var7 = var3.readUnsignedShort();

               for(var8 = 0; var8 < var7; ++var8) {
                  var9 = var3.readUnsignedByteAdd();
                  if (var9 == 255) {
                     var9 = var3.readUnsignedIntME();
                  }

                  var38 = var3.readUnsignedShortLE();
                  if (var6 != null && var8 < var6.itemIds.length) {
                     var6.itemIds[var8] = var38;
                     var6.itemQuantities[var8] = var9;
                  }

                  class12.itemContainerSetItem(var5, var8, var38 - 1, var9);
               }

               if (var6 != null) {
                  class69.invalidateWidget(var6);
               }

               class136.method3073();
               changedItemContainers[++field709 - 1 & 31] = var5 & 32767;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.NPC_INFO_SMALL_VIEWPORT_2 == var1.serverPacket) {
               class312.updateNpcs(true, var3);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
               var3.offset += 28;
               if (var3.checkCrc()) {
                  TileItem.method2619(var3, var3.offset - 28);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3222 == var1.serverPacket) {
               DevicePcmPlayerProvider.method315(class276.field3161);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
               var20 = var3.readUnsignedShortLE();
               if (var20 == 65535) {
                  var20 = -1;
               }

               var5 = var3.readUnsignedIntLE();
               var27 = var3.readUnsignedIntME();
               var86 = PlayerCompositionColorTextureOverride.getWidget(var5);
               ItemComposition var89;
               if (!var86.isIf3) {
                  if (var20 == -1) {
                     var86.modelType = 0;
                     var1.serverPacket = null;
                     return true;
                  }

                  var89 = NPCComposition.ItemDefinition_get(var20);
                  var86.modelType = 4;
                  var86.modelId = var20;
                  var86.modelAngleX = var89.xan2d;
                  var86.modelAngleY = var89.yan2d;
                  var86.modelZoom = var89.zoom2d * 100 / var27;
                  class69.invalidateWidget(var86);
               } else {
                  var86.itemId = var20;
                  var86.itemQuantity = var27;
                  var89 = NPCComposition.ItemDefinition_get(var20);
                  var86.modelAngleX = var89.xan2d;
                  var86.modelAngleY = var89.yan2d;
                  var86.modelAngleZ = var89.zan2d;
                  var86.modelOffsetX = var89.offsetX2d;
                  var86.modelOffsetY = var89.offsetY2d;
                  var86.modelZoom = var89.zoom2d;
                  if (var89.isStackable == 1) {
                     var86.itemQuantityMode = 1;
                  } else {
                     var86.itemQuantityMode = 2;
                  }

                  if (var86.field3659 > 0) {
                     var86.modelZoom = var86.modelZoom * 32 / var86.field3659;
                  } else if (var86.rawWidth > 0) {
                     var86.modelZoom = var86.modelZoom * 32 / var86.rawWidth;
                  }

                  class69.invalidateWidget(var86);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3293 == var1.serverPacket) {
               DevicePcmPlayerProvider.method315(class276.field3163);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3287 == var1.serverPacket) {
               class125.field1560 = var3.readUnsignedByteSub();
               InvDefinition.field1918 = var3.readUnsignedByteSub();
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_SETANGLE == var1.serverPacket) {
               var20 = var3.readUnsignedIntLE();
               var5 = var3.readUnsignedShortAdd();
               var27 = var3.readUnsignedShortAdd();
               var7 = var3.readUnsignedShortAdd();
               var40 = PlayerCompositionColorTextureOverride.getWidget(var20);
               if (var5 != var40.modelAngleX || var7 != var40.modelAngleY || var27 != var40.modelZoom) {
                  var40.modelAngleX = var5;
                  var40.modelAngleY = var7;
                  var40.modelZoom = var27;
                  class69.invalidateWidget(var40);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3269 == var1.serverPacket) {
               var20 = var3.offset + var1.serverPacketLength;
               var5 = var3.readUnsignedShort();
               var27 = var3.readUnsignedShort();
               if (var5 != rootInterface) {
                  rootInterface = var5;
                  this.resizeRoot(false);
                  class69.Widget_resetModelFrames(rootInterface);
                  class31.runWidgetOnLoadListener(rootInterface);

                  for(var7 = 0; var7 < 100; ++var7) {
                     field731[var7] = true;
                  }
               }

               InterfaceParent var10;
               for(; var27-- > 0; var10.field1067 = true) {
                  var7 = var3.readInt();
                  var8 = var3.readUnsignedShort();
                  var9 = var3.readUnsignedByte();
                  var10 = (InterfaceParent)interfaceParents.get((long)var7);
                  if (var10 != null && var8 != var10.group) {
                     class9.closeInterface(var10, true);
                     var10 = null;
                  }

                  if (var10 == null) {
                     var10 = class7.method44(var7, var8, var9);
                  }
               }

               for(var85 = (InterfaceParent)interfaceParents.first(); var85 != null; var85 = (InterfaceParent)interfaceParents.next()) {
                  if (var85.field1067) {
                     var85.field1067 = false;
                  } else {
                     class9.closeInterface(var85, true);
                  }
               }

               widgetFlags = new NodeHashTable(512);

               while(var3.offset < var20) {
                  var7 = var3.readInt();
                  var8 = var3.readUnsignedShort();
                  var9 = var3.readUnsignedShort();
                  var38 = var3.readInt();

                  for(var84 = var8; var84 <= var9; ++var84) {
                     var44 = ((long)var7 << 32) + (long)var84;
                     widgetFlags.put(new IntegerNode(var38), var44);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) {
               var5 = var3.readUnsignedIntLE();
               var20 = var3.readUnsignedShort();
               var39 = npcs[var20];
               var27 = var3.readUnsignedShort();
               if (var39 != null) {
                  var39.spotAnimation = var27;
                  var39.spotAnimationHeight = var5 >> 16;
                  var39.field1227 = (var5 & '\uffff') + cycle;
                  var39.spotAnimationFrame = 0;
                  var39.spotAnimationFrameCycle = 0;
                  if (var39.field1227 > cycle) {
                     var39.spotAnimationFrame = -1;
                  }

                  if (var39.spotAnimation == 65535) {
                     var39.spotAnimation = -1;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3235 == var1.serverPacket) {
               DevicePcmPlayerProvider.method315(class276.field3165);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.TRIGGER_ONDIALOG_ABORT == var1.serverPacket) {
               if (rootInterface != -1) {
                  GrandExchangeOfferAgeComparator.runIntfCloseListeners(rootInterface, 0);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.CAM_SETANGLE == var1.serverPacket) {
               isCameraLocked = true;
               field772 = false;
               class109.field1442 = var3.readUnsignedByte() * 128;
               class146.field1718 = var3.readUnsignedByte() * 16384;
               class104.field1398 = var3.readUnsignedShort();
               class415.field4647 = var3.readUnsignedByte();
               LoginScreenAnimation.field1283 = var3.readUnsignedByte();
               if (LoginScreenAnimation.field1283 >= 100) {
                  var20 = class109.field1442 * 16384 + 64;
                  var5 = class146.field1718 * 128 + 64;
                  var27 = SpotAnimationDefinition.getTileHeight(var20, var5, class383.Client_plane) - class104.field1398;
                  var7 = var20 - class145.cameraX;
                  var8 = var27 - class414.cameraY;
                  var9 = var5 - ClanChannel.cameraZ;
                  var38 = (int)Math.sqrt((double)(var9 * var9 + var7 * var7));
                  class97.cameraPitch = (int)(Math.atan2((double)var8, (double)var38) * 325.9490051269531) & 2047;
                  class128.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531) & 2047;
                  if (class97.cameraPitch < 128) {
                     class97.cameraPitch = 128;
                  }

                  if (class97.cameraPitch > 383) {
                     class97.cameraPitch = 383;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3266 == var1.serverPacket) {
               var74 = var3.readByte();
               var28 = (long)var3.readUnsignedShort();
               var30 = (long)var3.readMedium();
               var41 = var30 + (var28 << 32);
               boolean var37 = false;
               ClanChannel var46 = var74 >= 0 ? currentClanChannels[var74] : VarcInt.guestClanChannel;
               if (var46 == null) {
                  var37 = true;
               } else {
                  for(var13 = 0; var13 < 100; ++var13) {
                     if (crossWorldMessageIds[var13] == var41) {
                        var37 = true;
                        break;
                     }
                  }
               }

               if (!var37) {
                  crossWorldMessageIds[crossWorldMessageIdsIndex] = var41;
                  crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
                  var35 = class153.method3285(var3);
                  var36 = var74 >= 0 ? 43 : 46;
                  class381.addChatMessage(var36, "", var35, var46.name);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3241 == var1.serverPacket) {
               class136.method3073();
               runEnergy = var3.readUnsignedByte();
               runEnergy *= 100;
               field721 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_SETHIDE == var1.serverPacket) {
               var20 = var3.readUnsignedIntME();
               var55 = var3.readUnsignedByte() == 1;
               var6 = PlayerCompositionColorTextureOverride.getWidget(var20);
               if (var55 != var6.isHidden) {
                  var6.isHidden = var55;
                  class69.invalidateWidget(var6);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.NPC_INFO_SMALL_VIEWPORT_1 == var1.serverPacket) {
               ParamComposition.field2121 = true;
               class312.updateNpcs(true, var3);
               var1.serverPacket = null;
               return true;
            }

            Widget var71;
            if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) {
               var20 = var3.readUnsignedIntME();
               var71 = PlayerCompositionColorTextureOverride.getWidget(var20);
               var71.modelType = 3;
               var71.modelId = class155.localPlayer.appearance.getChatHeadId();
               class69.invalidateWidget(var71);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3242 == var1.serverPacket) {
               class136.method3073();
               weight = var3.readShort();
               field721 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3189 == var1.serverPacket) {
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3251 == var1.serverPacket) {
               return this.method1432(var1, 2);
            }

            if (ServerPacket.field3184 == var1.serverPacket) {
               var20 = var3.readInt();
               if (var20 != field789) {
                  field789 = var20;
                  CollisionMap.method4157();
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) {
               var49 = var3.readStringCp1252NullTerminated();
               Object[] var72 = new Object[var49.length() + 1];

               for(var27 = var49.length() - 1; var27 >= 0; --var27) {
                  if (var49.charAt(var27) == 's') {
                     var72[var27 + 1] = var3.readStringCp1252NullTerminated();
                  } else {
                     var72[var27 + 1] = new Integer(var3.readInt());
                  }
               }

               var72[0] = new Integer(var3.readInt());
               ScriptEvent var52 = new ScriptEvent();
               var52.args = var72;
               WorldMapElement.runScriptEvent(var52);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) {
               var20 = var3.readInt();
               var5 = var3.readUnsignedShortAdd();
               var6 = PlayerCompositionColorTextureOverride.getWidget(var20);
               if (var6 != null && var6.type == 0) {
                  if (var5 > var6.scrollHeight - var6.height) {
                     var5 = var6.scrollHeight - var6.height;
                  }

                  if (var5 < 0) {
                     var5 = 0;
                  }

                  if (var5 != var6.scrollY) {
                     var6.scrollY = var5;
                     class69.invalidateWidget(var6);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) {
               var20 = var3.readUnsignedShortAddLE();
               DynamicObject.method2139(var20);
               changedItemContainers[++field709 - 1 & 31] = var20 & 32767;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3253 == var1.serverPacket) {
               var20 = var3.readUnsignedByte();
               var5 = var3.readUnsignedByte();
               var27 = var3.readUnsignedByte();
               var7 = var3.readUnsignedByte();
               field773[var20] = true;
               field803[var20] = var5;
               field775[var20] = var27;
               field776[var20] = var7;
               field617[var20] = 0;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.MINIMAP_FLAG_SET == var1.serverPacket) {
               destinationX = var3.readUnsignedByte();
               if (destinationX == 255) {
                  destinationX = 0;
               }

               destinationY = var3.readUnsignedByte();
               if (destinationY == 255) {
                  destinationY = 0;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) {
               var20 = var3.readInt();
               var71 = PlayerCompositionColorTextureOverride.getWidget(var20);

               for(var27 = 0; var27 < var71.itemIds.length; ++var27) {
                  var71.itemIds[var27] = -1;
                  var71.itemIds[var27] = 0;
               }

               class69.invalidateWidget(var71);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.LOGOUT == var1.serverPacket) {
               var20 = var3.readUnsignedByte();
               PlayerComposition.forceDisconnect(var20);
               var1.serverPacket = null;
               return false;
            }

            if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) {
               publicChatMode = var3.readUnsignedByte();
               tradeChatMode = var3.readUnsignedByteSub();
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3186 == var1.serverPacket) {
               DevicePcmPlayerProvider.method315(class276.field3158);
               var1.serverPacket = null;
               return true;
            }

            class132.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1432 != null ? var1.field1432.id : -1) + "," + (var1.field1433 != null ? var1.field1433.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
            Player.logOut();
         } catch (IOException var47) {
            FaceNormal.method4619();
         } catch (Exception var48) {
            var21 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1432 != null ? var1.field1432.id : -1) + "," + (var1.field1433 != null ? var1.field1433.id : -1) + "," + var1.serverPacketLength + "," + (class155.localPlayer.pathX[0] + class154.baseX * 64) + "," + (class155.localPlayer.pathY[0] + class365.baseY * 64) + ",";

            for(var27 = 0; var27 < var1.serverPacketLength && var27 < 50; ++var27) {
               var21 = var21 + var3.array[var27] + ",";
            }

            class132.RunException_sendStackTrace(var21, var48);
            Player.logOut();
         }

         return true;
      }
   }

   @ObfuscatedName("jr")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "919576358"
   )
   @Export("menu")
   final void menu() {
      boolean var1 = false;

      int var2;
      int var5;
      while(!var1) {
         var1 = true;

         for(var2 = 0; var2 < menuOptionsCount - 1; ++var2) {
            if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) {
               String var18 = menuTargets[var2];
               menuTargets[var2] = menuTargets[var2 + 1];
               menuTargets[var2 + 1] = var18;
               String var19 = menuActions[var2];
               menuActions[var2] = menuActions[var2 + 1];
               menuActions[var2 + 1] = var19;
               var5 = menuOpcodes[var2];
               menuOpcodes[var2] = menuOpcodes[var2 + 1];
               menuOpcodes[var2 + 1] = var5;
               var5 = menuArguments1[var2];
               menuArguments1[var2] = menuArguments1[var2 + 1];
               menuArguments1[var2 + 1] = var5;
               var5 = menuArguments2[var2];
               menuArguments2[var2] = menuArguments2[var2 + 1];
               menuArguments2[var2 + 1] = var5;
               var5 = menuIdentifiers[var2];
               menuIdentifiers[var2] = menuIdentifiers[var2 + 1];
               menuIdentifiers[var2 + 1] = var5;
               var5 = menuItemIds[var2];
               menuItemIds[var2] = menuItemIds[var2 + 1];
               menuItemIds[var2 + 1] = var5;
               boolean var6 = menuShiftClick[var2];
               menuShiftClick[var2] = menuShiftClick[var2 + 1];
               menuShiftClick[var2 + 1] = var6;
               var1 = false;
            }
         }
      }

      if (class368.dragInventoryWidget == null) {
         if (clickedWidget == null) {
            int var21;
            label270: {
               int var20 = MouseHandler.MouseHandler_lastButton;
               int var4;
               int var9;
               int var11;
               int var15;
               int var22;
               if (isMenuOpen) {
                  int var3;
                  if (var20 != 1 && (SceneTilePaint.mouseCam || var20 != 4)) {
                     var2 = MouseHandler.MouseHandler_x;
                     var3 = MouseHandler.MouseHandler_y;
                     if (var2 < VarcInt.menuX - 10 || var2 > AttackOption.menuWidth + VarcInt.menuX + 10 || var3 < NPC.menuY - 10 || var3 > MouseHandler.menuHeight + NPC.menuY + 10) {
                        isMenuOpen = false;
                        ReflectionCheck.method714(VarcInt.menuX, NPC.menuY, AttackOption.menuWidth, MouseHandler.menuHeight);
                     }
                  }

                  if (var20 == 1 || !SceneTilePaint.mouseCam && var20 == 4) {
                     var2 = VarcInt.menuX;
                     var3 = NPC.menuY;
                     var4 = AttackOption.menuWidth;
                     var5 = MouseHandler.MouseHandler_lastPressedX;
                     var21 = MouseHandler.MouseHandler_lastPressedY;
                     var15 = -1;

                     for(var22 = 0; var22 < menuOptionsCount; ++var22) {
                        var9 = var3 + (menuOptionsCount - 1 - var22) * 15 + 31;
                        if (var5 > var2 && var5 < var4 + var2 && var21 > var9 - 13 && var21 < var9 + 3) {
                           var15 = var22;
                        }
                     }

                     if (var15 != -1 && var15 >= 0) {
                        var22 = menuArguments1[var15];
                        var9 = menuArguments2[var15];
                        int var23 = menuOpcodes[var15];
                        var11 = menuIdentifiers[var15];
                        int var12 = menuItemIds[var15];
                        String var13 = menuActions[var15];
                        String var14 = menuTargets[var15];
                        WorldMapData_0.menuAction(var22, var9, var23, var11, var12, var13, var14, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
                     }

                     isMenuOpen = false;
                     ReflectionCheck.method714(VarcInt.menuX, NPC.menuY, AttackOption.menuWidth, MouseHandler.menuHeight);
                  }
               } else {
                  var2 = menuOptionsCount - 1;
                  if ((var20 == 1 || !SceneTilePaint.mouseCam && var20 == 4) && var2 >= 0) {
                     var4 = menuOpcodes[var2];
                     if (var4 == 39 || var4 == 40 || var4 == 41 || var4 == 42 || var4 == 43 || var4 == 33 || var4 == 34 || var4 == 35 || var4 == 36 || var4 == 37 || var4 == 38 || var4 == 1005) {
                        var5 = menuArguments1[var2];
                        var21 = menuArguments2[var2];
                        Widget var7 = PlayerCompositionColorTextureOverride.getWidget(var21);
                        var9 = Clock.getWidgetFlags(var7);
                        boolean var8 = (var9 >> 28 & 1) != 0;
                        if (var8) {
                           break label270;
                        }

                        var11 = Clock.getWidgetFlags(var7);
                        boolean var10 = (var11 >> 29 & 1) != 0;
                        if (var10) {
                           break label270;
                        }
                     }
                  }

                  if ((var20 == 1 || !SceneTilePaint.mouseCam && var20 == 4) && this.shouldLeftClickOpenMenu()) {
                     var20 = 2;
                  }

                  if ((var20 == 1 || !SceneTilePaint.mouseCam && var20 == 4) && menuOptionsCount > 0 && var2 >= 0) {
                     var4 = menuArguments1[var2];
                     var5 = menuArguments2[var2];
                     var21 = menuOpcodes[var2];
                     var15 = menuIdentifiers[var2];
                     var22 = menuItemIds[var2];
                     String var16 = menuActions[var2];
                     String var17 = menuTargets[var2];
                     WorldMapData_0.menuAction(var4, var5, var21, var15, var22, var16, var17, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
                  }

                  if (var20 == 2 && menuOptionsCount > 0) {
                     this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
                  }
               }

               return;
            }

            if (class368.dragInventoryWidget != null && !field630 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) {
               WorldMapLabelSize.method4861(draggedWidgetX, draggedWidgetY);
            }

            field630 = false;
            itemDragDuration = 0;
            if (class368.dragInventoryWidget != null) {
               class69.invalidateWidget(class368.dragInventoryWidget);
            }

            class368.dragInventoryWidget = PlayerCompositionColorTextureOverride.getWidget(var21);
            dragItemSlotSource = var5;
            draggedWidgetX = MouseHandler.MouseHandler_lastPressedX;
            draggedWidgetY = MouseHandler.MouseHandler_lastPressedY;
            if (var2 >= 0) {
               ReflectionCheck.method711(var2);
            }

            class69.invalidateWidget(class368.dragInventoryWidget);
         }
      }
   }

   @ObfuscatedName("jp")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1964270751"
   )
   @Export("shouldLeftClickOpenMenu")
   final boolean shouldLeftClickOpenMenu() {
      int var1 = menuOptionsCount - 1;
      return (leftClickOpensMenu && menuOptionsCount > 2 || class281.method5505(var1)) && !menuShiftClick[var1];
   }

   @ObfuscatedName("jn")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "712334109"
   )
   @Export("openMenu")
   final void openMenu(int var1, int var2) {
      int var3 = class146.fontBold12.stringWidth("Choose Option");

      int var4;
      int var5;
      for(var4 = 0; var4 < menuOptionsCount; ++var4) {
         var5 = class146.fontBold12.stringWidth(class34.method491(var4));
         if (var5 > var3) {
            var3 = var5;
         }
      }

      var3 += 8;
      var4 = menuOptionsCount * 15 + 22;
      var5 = var1 - var3 / 2;
      if (var3 + var5 > CollisionMap.canvasWidth) {
         var5 = CollisionMap.canvasWidth - var3;
      }

      if (var5 < 0) {
         var5 = 0;
      }

      int var6 = var2;
      if (var4 + var2 > Language.canvasHeight) {
         var6 = Language.canvasHeight - var4;
      }

      if (var6 < 0) {
         var6 = 0;
      }

      VarcInt.menuX = var5;
      NPC.menuY = var6;
      AttackOption.menuWidth = var3;
      MouseHandler.menuHeight = menuOptionsCount * 15 + 22;
      var1 -= viewportOffsetX;
      var2 -= viewportOffsetY;
      ReflectionCheck.scene.menuOpen(class383.Client_plane, var1, var2, false);
      isMenuOpen = true;
   }

   @ObfuscatedName("kb")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-462347970"
   )
   @Export("resizeRoot")
   final void resizeRoot(boolean var1) {
      ByteArrayPool.method7319(rootInterface, CollisionMap.canvasWidth, Language.canvasHeight, var1);
   }

   @ObfuscatedName("kp")
   @ObfuscatedSignature(
      descriptor = "(Lkd;I)V",
      garbageValue = "-1538657910"
   )
   @Export("alignWidget")
   void alignWidget(Widget var1) {
      Widget var2 = var1.parentId == -1 ? null : PlayerCompositionColorTextureOverride.getWidget(var1.parentId);
      int var3;
      int var4;
      if (var2 == null) {
         var3 = CollisionMap.canvasWidth;
         var4 = Language.canvasHeight;
      } else {
         var3 = var2.width;
         var4 = var2.height;
      }

      Player.alignWidgetSize(var1, var3, var4, false);
      class89.alignWidgetPosition(var1, var3, var4);
   }

   @ObfuscatedName("ls")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "607225278"
   )
   final void method1261() {
      class69.invalidateWidget(clickedWidget);
      ++class87.widgetDragDuration;
      if (field701 && field745) {
         int var1 = MouseHandler.MouseHandler_x;
         int var2 = MouseHandler.MouseHandler_y;
         var1 -= widgetClickX;
         var2 -= widgetClickY;
         if (var1 < field699) {
            var1 = field699;
         }

         if (var1 + clickedWidget.width > field699 + clickedWidgetParent.width) {
            var1 = field699 + clickedWidgetParent.width - clickedWidget.width;
         }

         if (var2 < field613) {
            var2 = field613;
         }

         if (var2 + clickedWidget.height > field613 + clickedWidgetParent.height) {
            var2 = field613 + clickedWidgetParent.height - clickedWidget.height;
         }

         int var3 = var1 - field519;
         int var4 = var2 - field703;
         int var5 = clickedWidget.dragZoneSize;
         if (class87.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
            isDraggingWidget = true;
         }

         int var6 = var1 - field699 + clickedWidgetParent.scrollX;
         int var7 = var2 - field613 + clickedWidgetParent.scrollY;
         ScriptEvent var8;
         if (clickedWidget.onDrag != null && isDraggingWidget) {
            var8 = new ScriptEvent();
            var8.widget = clickedWidget;
            var8.mouseX = var6;
            var8.mouseY = var7;
            var8.args = clickedWidget.onDrag;
            WorldMapElement.runScriptEvent(var8);
         }

         if (MouseHandler.MouseHandler_currentButton == 0) {
            if (isDraggingWidget) {
               if (clickedWidget.onDragComplete != null) {
                  var8 = new ScriptEvent();
                  var8.widget = clickedWidget;
                  var8.mouseX = var6;
                  var8.mouseY = var7;
                  var8.dragTarget = draggedOnWidget;
                  var8.args = clickedWidget.onDragComplete;
                  WorldMapElement.runScriptEvent(var8);
               }

               if (draggedOnWidget != null) {
                  Widget var9 = clickedWidget;
                  int var11 = Clock.getWidgetFlags(var9);
                  int var10 = var11 >> 17 & 7;
                  int var12 = var10;
                  Widget var15;
                  if (var10 == 0) {
                     var15 = null;
                  } else {
                     int var13 = 0;

                     while(true) {
                        if (var13 >= var12) {
                           var15 = var9;
                           break;
                        }

                        var9 = PlayerCompositionColorTextureOverride.getWidget(var9.parentId);
                        if (var9 == null) {
                           var15 = null;
                           break;
                        }

                        ++var13;
                     }
                  }

                  if (var15 != null) {
                     PacketBufferNode var14 = class136.getPacketBufferNode(ClientPacket.OPHELDD, packetWriter.isaacCipher);
                     var14.packetBuffer.writeShortLE(clickedWidget.itemId);
                     var14.packetBuffer.writeShortAddLE(clickedWidget.childIndex);
                     var14.packetBuffer.writeIntME(draggedOnWidget.id);
                     var14.packetBuffer.writeIntLE(clickedWidget.id);
                     var14.packetBuffer.writeShortLE(draggedOnWidget.childIndex);
                     var14.packetBuffer.writeShortLE(draggedOnWidget.itemId);
                     packetWriter.addNode(var14);
                  }
               }
            } else if (this.shouldLeftClickOpenMenu()) {
               this.openMenu(field519 + widgetClickX, widgetClickY + field703);
            } else if (menuOptionsCount > 0) {
               WorldMapLabelSize.method4861(field519 + widgetClickX, field703 + widgetClickY);
            }

            clickedWidget = null;
         }

      } else {
         if (class87.widgetDragDuration > 1) {
            if (!isDraggingWidget && menuOptionsCount > 0) {
               WorldMapLabelSize.method4861(widgetClickX + field519, field703 + widgetClickY);
            }

            clickedWidget = null;
         }

      }
   }

   @ObfuscatedName("mw")
   @ObfuscatedSignature(
      descriptor = "(B)Lrp;",
      garbageValue = "77"
   )
   @Export("username")
   public Username username() {
      return class155.localPlayer != null ? class155.localPlayer.username : null;
   }

   public final void init() {
      try {
         if (this.checkHost()) {
            int var8;
            for(int var1 = 0; var1 <= 28; ++var1) {
               String var2 = this.getParameter(Integer.toString(var1));
               if (var2 != null) {
                  switch (var1) {
                     case 3:
                        if (var2.equalsIgnoreCase("true")) {
                           isMembersWorld = true;
                        } else {
                           isMembersWorld = false;
                        }
                        break;
                     case 4:
                        if (clientType == -1) {
                           clientType = Integer.parseInt(var2);
                        }
                        break;
                     case 5:
                        worldProperties = Integer.parseInt(var2);
                        break;
                     case 6:
                        int var4 = Integer.parseInt(var2);
                        Language var17;
                        if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) {
                           var17 = Language.Language_valuesOrdered[var4];
                        } else {
                           var17 = null;
                        }

                        class173.clientLanguage = var17;
                        break;
                     case 7:
                        ModeWhere.field4325 = class16.method198(Integer.parseInt(var2));
                        break;
                     case 8:
                        if (var2.equalsIgnoreCase("true")) {
                        }
                        break;
                     case 9:
                        class133.field1635 = var2;
                        break;
                     case 10:
                        StudioGame[] var3 = new StudioGame[]{StudioGame.game3, StudioGame.stellardawn, StudioGame.runescape, StudioGame.oldscape, StudioGame.game5, StudioGame.game4};
                        LoginPacket.field3302 = (StudioGame)World.findEnumerated(var3, Integer.parseInt(var2));
                        if (LoginPacket.field3302 == StudioGame.oldscape) {
                           SecureRandomFuture.loginType = LoginType.oldscape;
                        } else {
                           SecureRandomFuture.loginType = LoginType.field4837;
                        }
                        break;
                     case 11:
                        class17.field102 = var2;
                        break;
                     case 12:
                        worldId = Integer.parseInt(var2);
                     case 13:
                     case 16:
                     case 18:
                     case 19:
                     case 20:
                     case 22:
                     case 23:
                     case 24:
                     default:
                        break;
                     case 14:
                        WallDecoration.field2799 = Integer.parseInt(var2);
                        break;
                     case 15:
                        gameBuild = Integer.parseInt(var2);
                        break;
                     case 17:
                        class9.field41 = var2;
                        break;
                     case 21:
                        field511 = Integer.parseInt(var2);
                        break;
                     case 25:
                        var8 = var2.indexOf(".");
                        if (var8 == -1) {
                           field515 = Integer.parseInt(var2);
                        } else {
                           field515 = Integer.parseInt(var2.substring(0, var8));
                           Integer.parseInt(var2.substring(var8 + 1));
                        }
                  }
               }
            }

            class34.method485();
            class139.worldHost = this.getCodeBase().getHost();
            String var9 = ModeWhere.field4325.name;
            byte var10 = 0;

            try {
               class145.idxCount = 22;
               LoginPacket.cacheGamebuild = var10;

               try {
                  FillMode.operatingSystemName = System.getProperty("os.name");
               } catch (Exception var14) {
                  FillMode.operatingSystemName = "Unknown";
               }

               Decimator.formattedOperatingSystemName = FillMode.operatingSystemName.toLowerCase();

               try {
                  UserComparator3.userHomeDirectory = System.getProperty("user.home");
                  if (UserComparator3.userHomeDirectory != null) {
                     UserComparator3.userHomeDirectory = UserComparator3.userHomeDirectory + "/";
                  }
               } catch (Exception var13) {
               }

               try {
                  if (Decimator.formattedOperatingSystemName.startsWith("win")) {
                     if (UserComparator3.userHomeDirectory == null) {
                        UserComparator3.userHomeDirectory = System.getenv("USERPROFILE");
                     }
                  } else if (UserComparator3.userHomeDirectory == null) {
                     UserComparator3.userHomeDirectory = System.getenv("HOME");
                  }

                  if (UserComparator3.userHomeDirectory != null) {
                     UserComparator3.userHomeDirectory = UserComparator3.userHomeDirectory + "/";
                  }
               } catch (Exception var12) {
               }

               if (UserComparator3.userHomeDirectory == null) {
                  UserComparator3.userHomeDirectory = "~/";
               }

               class121.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", UserComparator3.userHomeDirectory, "/tmp/", ""};
               class89.cacheSubPaths = new String[]{".jagex_cache_" + LoginPacket.cacheGamebuild, ".file_store_" + LoginPacket.cacheGamebuild};

               label135:
               for(var8 = 0; var8 < 4; ++var8) {
                  class281.cacheDir = VarcInt.method3572("oldschool", var9, var8);
                  if (!class281.cacheDir.exists()) {
                     class281.cacheDir.mkdirs();
                  }

                  File[] var11 = class281.cacheDir.listFiles();
                  if (var11 == null) {
                     break;
                  }

                  File[] var5 = var11;
                  int var6 = 0;

                  while(true) {
                     if (var6 >= var5.length) {
                        break label135;
                     }

                     File var7 = var5[var6];
                     if (!WorldMapLabelSize.method4858(var7, false)) {
                        break;
                     }

                     ++var6;
                  }
               }

               class170.method3487(class281.cacheDir);
               WorldMapSectionType.method5237();
               JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class306.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
               JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class306.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
               JagexCache.JagexCache_idxFiles = new BufferedFile[class145.idxCount];

               for(var8 = 0; var8 < class145.idxCount; ++var8) {
                  JagexCache.JagexCache_idxFiles[var8] = new BufferedFile(new AccessFile(class306.getFile("main_file_cache.idx" + var8), "rw", 1048576L), 6000, 0);
               }
            } catch (Exception var15) {
               class132.RunException_sendStackTrace((String)null, var15);
            }

            BuddyRankComparator.client = this;
            RunException.clientType = clientType;
            if (field698 == -1) {
               field698 = 0;
            }

            class146.field1717 = System.getenv("JX_ACCESS_TOKEN");
            EnumComposition.field2006 = System.getenv("JX_REFRESH_TOKEN");
            if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
               this.field590 = true;
            }

            this.startThread(765, 503, 210, 1);
         }
      } catch (RuntimeException var16) {
         throw EnumComposition.newRunException(var16, "client.init(" + ')');
      }
   }

   public void setOtlTokenRequester(OtlTokenRequester var1) {
      if (var1 != null) {
         this.field548 = var1;
         class12.method155(10);
      }
   }

   public boolean isOnLoginScreen() {
      return gameState == 10;
   }

   public long getAccountHash() {
      return this.field559;
   }

   @ObfuscatedSignature(
      descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
   )
   public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
      if (var1 != null) {
         this.field666 = var1;
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZI)I",
      garbageValue = "-1945377907"
   )
   static int method1742(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.SOUND_SYNTH) {
         class87.Interpreter_intStackSize -= 3;
         class1.queueSoundEffect(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2]);
         return 1;
      } else if (var0 == ScriptOpcodes.SOUND_SONG) {
         class169.playSong(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]);
         return 1;
      } else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
         class87.Interpreter_intStackSize -= 2;
         class16.method197(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]);
         return 1;
      } else {
         class87 var3;
         class86 var4;
         int var5;
         int var6;
         String var7;
         if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
            if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
               return var0 == 3211 ? 1 : 2;
            } else {
               var3 = class87.field1114;
               var4 = class86.field1106;
               boolean var8 = false;
               if (var0 == 3214) {
                  var6 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  var3 = (class87)World.findEnumerated(class163.method3425(), var6);
                  if (var3 == null) {
                     throw new RuntimeException(String.format("Unrecognized device option %d", var6));
                  }
               }

               if (var0 == 3215) {
                  var6 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  var4 = (class86)World.findEnumerated(WorldMapEvent.method5404(), var6);
                  if (var4 == null) {
                     throw new RuntimeException(String.format("Unrecognized game option %d", var6));
                  }
               }

               if (var0 == 3210) {
                  var6 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  var3 = (class87)World.findEnumerated(class163.method3425(), var6);
                  if (var3 == null) {
                     var4 = (class86)World.findEnumerated(WorldMapEvent.method5404(), var6);
                     if (var4 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var6));
                     }
                  }
               } else if (var0 == 3182) {
                  var3 = class87.field1118;
               } else if (var0 == 3204) {
                  var4 = class86.field1097;
               } else if (var0 == 3206) {
                  var4 = class86.field1100;
               } else if (var0 == 3208) {
                  var4 = class86.field1101;
               }

               if (var4 == class86.field1106) {
                  switch (var3.field1115) {
                     case 1:
                        var5 = StructComposition.clientPreferences.method2413() ? 1 : 0;
                        break;
                     case 2:
                        var5 = StructComposition.clientPreferences.method2428() ? 1 : 0;
                        break;
                     case 3:
                        var5 = StructComposition.clientPreferences.method2419() ? 1 : 0;
                        break;
                     case 4:
                        var5 = StructComposition.clientPreferences.method2421();
                        break;
                     case 5:
                        var5 = class273.method5478();
                        break;
                     default:
                        var7 = String.format("Unkown device option: %s.", var3.toString());
                        throw new RuntimeException(var7);
                  }
               } else {
                  switch (var4.field1099) {
                     case 1:
                        var5 = StructComposition.clientPreferences.method2412() ? 1 : 0;
                        break;
                     case 2:
                        var6 = StructComposition.clientPreferences.method2425();
                        var5 = Math.round((float)(var6 * 100) / 255.0F);
                        break;
                     case 3:
                        var6 = StructComposition.clientPreferences.method2426();
                        var5 = Math.round((float)(var6 * 100) / 127.0F);
                        break;
                     case 4:
                        var6 = StructComposition.clientPreferences.method2506();
                        var5 = Math.round((float)(var6 * 100) / 127.0F);
                        break;
                     default:
                        var7 = String.format("Unkown game option: %s.", var4.toString());
                        throw new RuntimeException(var7);
                  }
               }

               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var5;
               return 1;
            }
         } else {
            var3 = class87.field1114;
            var4 = class86.field1106;
            var5 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            if (var0 == 3212) {
               var6 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               var3 = (class87)World.findEnumerated(class163.method3425(), var6);
               if (var3 == null) {
                  throw new RuntimeException(String.format("Unrecognized device option %d", var6));
               }
            }

            if (var0 == 3213) {
               var6 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               var4 = (class86)World.findEnumerated(WorldMapEvent.method5404(), var6);
               if (var4 == null) {
                  throw new RuntimeException(String.format("Unrecognized game option %d", var6));
               }
            }

            if (var0 == 3209) {
               var6 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               var3 = (class87)World.findEnumerated(class163.method3425(), var6);
               if (var3 == null) {
                  var4 = (class86)World.findEnumerated(WorldMapEvent.method5404(), var6);
                  if (var4 == null) {
                     throw new RuntimeException(String.format("Unrecognized client option %d", var6));
                  }
               }
            } else if (var0 == 3181) {
               var3 = class87.field1118;
            } else if (var0 == 3203) {
               var4 = class86.field1097;
            } else if (var0 == 3205) {
               var4 = class86.field1100;
            } else if (var0 == 3207) {
               var4 = class86.field1101;
            }

            if (var4 == class86.field1106) {
               switch (var3.field1115) {
                  case 1:
                     StructComposition.clientPreferences.method2461(var5 == 1);
                     break;
                  case 2:
                     StructComposition.clientPreferences.method2448(var5 == 1);
                     break;
                  case 3:
                     StructComposition.clientPreferences.method2470(var5 == 1);
                     break;
                  case 4:
                     if (var5 < 0) {
                        var5 = 0;
                     }

                     StructComposition.clientPreferences.method2420(var5);
                     break;
                  case 5:
                     class14.method170(var5);
                     break;
                  default:
                     var7 = String.format("Unkown device option: %s.", var3.toString());
                     throw new RuntimeException(var7);
               }
            } else {
               switch (var4.field1099) {
                  case 1:
                     StructComposition.clientPreferences.method2486(var5 == 1);
                     break;
                  case 2:
                     var5 = Math.min(Math.max(var5, 0), 100);
                     var6 = Math.round((float)(var5 * 255) / 100.0F);
                     class299.method5834(var6);
                     break;
                  case 3:
                     var5 = Math.min(Math.max(var5, 0), 100);
                     var6 = Math.round((float)(var5 * 127) / 100.0F);
                     class7.method43(var6);
                     break;
                  case 4:
                     var5 = Math.min(Math.max(var5, 0), 100);
                     var6 = Math.round((float)(var5 * 127) / 100.0F);
                     class18.method270(var6);
                     break;
                  default:
                     var7 = String.format("Unkown game option: %s.", var4.toString());
                     throw new RuntimeException(var7);
               }
            }

            return 1;
         }
      }
   }

   @ObfuscatedName("fm")
   @ObfuscatedSignature(
      descriptor = "(B)Lpb;",
      garbageValue = "45"
   )
   @Export("getWorldMap")
   static WorldMap getWorldMap() {
      return KitDefinition.worldMap;
   }

   @ObfuscatedName("gs")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-4511"
   )
   @Export("playPcmPlayers")
   static final void playPcmPlayers() {
      if (UserComparator8.pcmPlayer1 != null) {
         UserComparator8.pcmPlayer1.run();
      }

      if (TileItem.pcmPlayer0 != null) {
         TileItem.pcmPlayer0.run();
      }

   }
}
