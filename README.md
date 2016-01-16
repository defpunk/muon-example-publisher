# publisher

A Clojure library designed to demonstrate how to publish events using muon-clojure.

## Usage

This project is in the early stages at the moment it's primary a way to experiment with muon at the REPL.

To get started

1. Ensure you have a photon and rabbitmq instance running
2. Navigate to the root directory of the project
3. at the command line run 'lein repl'
4. Once the clojure repl starts run '(load "publisher/core")'
5. After the message about connecting to rabbit is displayed and the repl returns run '(ns publisher.core)'
6. To send test events run '(post-foo-event m "your value here")' foo is the key in teh test event pay load and "your value here" is the value you enter for the event 
7. To see the event open photon and view the examples stream

## License

Copyright © 2016 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
# muon-example-publisher
