%% DO NOT EDIT this file manually; it is automatically
%% generated from LSR http://lsr.dsi.unimi.it
%% Make any changes in LSR itself, or in Documentation/snippets/new/ ,
%% and then run scripts/auxiliar/makelsr.py
%%
%% This file is in the public domain.
\version "2.14.0"

\header {
  lsrtags = "rhythms, tweaks-and-overrides"

%% Translation of GIT committish: 615cbf212fdaf0b220b3330da417d0c3602494f2
  texidoces = "
De forma predeterminada, las líneas divisorias en los grupos
StaffGroup, PianoStaff o GrandStaff se conectan entre los pentagramas.
Se puede alterar este comportamiento pentagrama a pentagrama.

"
  doctitlees = "Quitar las barras de compás entre los pentagramas de un StaffGroup PianoStaff o GrandStaff"



  texidoc = "
By default, bar lines in StaffGroup, PianoStaff, or GrandStaff groups
are connected between the staves.  This behaviour can be overridden on
a staff-by-staff basis.

"
  doctitle = "Removing connecting bar lines on StaffGroup PianoStaff or GrandStaff"
} % begin verbatim

\relative c' {
  \new StaffGroup <<
    \new Staff {
      e1 | e
      \once \override Staff.BarLine #'allow-span-bar = ##f
      e1 | e | e
    }
    \new Staff {
      c1 | c | c
      \once \override Staff.BarLine #'allow-span-bar = ##f
      c1 | c
    }
    \new Staff {
      a1 | a | a | a | a
    }
  >>
}
