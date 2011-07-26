%% DO NOT EDIT this file manually; it is automatically
%% generated from LSR http://lsr.dsi.unimi.it
%% Make any changes in LSR itself, or in Documentation/snippets/new/ ,
%% and then run scripts/auxiliar/makelsr.py
%%
%% This file is in the public domain.
\version "2.14.0"

\header {
  lsrtags = "rhythms, ancient-notation, tweaks-and-overrides"

%% Translation of GIT committish: 615cbf212fdaf0b220b3330da417d0c3602494f2
  doctitlees = "Estilos de silencios"
  texidoces = "
Los silencios se pueden imprimir en distintos estilos.
"

%% Translation of GIT committish: 0a868be38a775ecb1ef935b079000cebbc64de40

  doctitlede = "Pausenstile"
  texidocde = "
Pausen können in verschiedenen Stilen dargestellt werden.
"



%% Translation of GIT committish: 4da4307e396243a5a3bc33a0c2753acac92cb685
  texidocfr = "
Les silences peuvent être gravés selon différents styles.

"
  doctitlefr = "Styles de silences"

  texidoc = "
Rests may be used in various styles.




"
  doctitle = "Rest styles"
} % begin verbatim

\layout {
  indent = 0
  \context {
    \Staff
    \remove "Time_signature_engraver"
  }
}

\new Staff \relative c {
  \cadenzaOn
  \override Staff.Rest #'style = #'mensural
  r\maxima^\markup \typewriter { mensural }
  r\longa r\breve r1 r2 r4 r8 r16 s32 s64 s128 s128
  \bar ""

  \override Staff.Rest #'style = #'neomensural
  r\maxima^\markup \typewriter { neomensural }
  r\longa r\breve r1 r2 r4 r8 r16 s32 s64 s128 s128
  \bar ""

  \override Staff.Rest #'style = #'classical
  r\maxima^\markup \typewriter { classical }
  r\longa r\breve r1 r2 r4 r8 r16 r32 r64 r128 s128
  \bar ""

  \override Staff.Rest  #'style = #'default
  r\maxima^\markup \typewriter { default }
  r\longa r\breve r1 r2 r4 r8 r16 r32 r64 r128 s128
}

